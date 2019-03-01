package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * offers some settings which are allowed even for objects which are not yet inserted into a draw page.
  * @deprecated Deprecatedreplaced by com::sun::star::lang::XServiceName
  */
trait XShapeDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the programmatic name of the shape type. */
  val ShapeType: java.lang.String
  /** @returns the programmatic name of the shape type. */
  def getShapeType(): java.lang.String
}

object XShapeDescriptor {
  @scala.inline
  def apply(
    ShapeType: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getShapeType: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XShapeDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ShapeType")(ShapeType)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getShapeType")(getShapeType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XShapeDescriptor]
  }
}

