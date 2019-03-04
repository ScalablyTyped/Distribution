package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XUniversalShapeDescriptor extends XShapeDescriptor {
  def setShapeType(aShapeTypeName: java.lang.String): scala.Unit
}

object XUniversalShapeDescriptor {
  @scala.inline
  def apply(
    ShapeType: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getShapeType: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setShapeType: js.Function1[java.lang.String, scala.Unit]
  ): XUniversalShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType, acquire = acquire, getShapeType = getShapeType, queryInterface = queryInterface, release = release, setShapeType = setShapeType)
  
    __obj.asInstanceOf[XUniversalShapeDescriptor]
  }
}

