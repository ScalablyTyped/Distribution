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
    acquire: js.Function0[scala.Unit],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setControllerPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit]
  ): XCustomShapeHandle = {
    val __obj = js.Dynamic.literal(Position = Position, acquire = acquire, getPosition = getPosition, queryInterface = queryInterface, release = release, setControllerPosition = setControllerPosition)
  
    __obj.asInstanceOf[XCustomShapeHandle]
  }
}

