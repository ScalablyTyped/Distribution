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

