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
    acquire: () => scala.Unit,
    getShapeType: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType, acquire = js.Any.fromFunction0(acquire), getShapeType = js.Any.fromFunction0(getShapeType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XShapeDescriptor]
  }
}

