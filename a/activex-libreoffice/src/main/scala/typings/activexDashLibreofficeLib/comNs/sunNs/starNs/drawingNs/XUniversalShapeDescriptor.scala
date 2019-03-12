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
    acquire: () => scala.Unit,
    getShapeType: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setShapeType: java.lang.String => scala.Unit
  ): XUniversalShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType, acquire = js.Any.fromFunction0(acquire), getShapeType = js.Any.fromFunction0(getShapeType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setShapeType = js.Any.fromFunction1(setShapeType))
  
    __obj.asInstanceOf[XUniversalShapeDescriptor]
  }
}

