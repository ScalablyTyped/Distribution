package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeHandle} */
trait XCustomShapeHandle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  val Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  def getPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** is setting a new position for the handle */
  def setControllerPosition(aPoint: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
}

object XCustomShapeHandle {
  @scala.inline
  def apply(
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    acquire: () => scala.Unit,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setControllerPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Unit
  ): XCustomShapeHandle = {
    val __obj = js.Dynamic.literal(Position = Position, acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControllerPosition = js.Any.fromFunction1(setControllerPosition))
  
    __obj.asInstanceOf[XCustomShapeHandle]
  }
}

