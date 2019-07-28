package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeHandle} */
trait XCustomShapeHandle extends XInterface {
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  val Position: Point
  /**
    * is getting the actual handle position
    * @returns a the actual handle position
    */
  def getPosition(): Point
  /** is setting a new position for the handle */
  def setControllerPosition(aPoint: Point): Unit
}

object XCustomShapeHandle {
  @scala.inline
  def apply(
    Position: Point,
    acquire: () => Unit,
    getPosition: () => Point,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControllerPosition: Point => Unit
  ): XCustomShapeHandle = {
    val __obj = js.Dynamic.literal(Position = Position, acquire = js.Any.fromFunction0(acquire), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControllerPosition = js.Any.fromFunction1(setControllerPosition))
  
    __obj.asInstanceOf[XCustomShapeHandle]
  }
}

