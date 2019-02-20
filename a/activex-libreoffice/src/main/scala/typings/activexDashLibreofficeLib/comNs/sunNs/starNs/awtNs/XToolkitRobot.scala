package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows injection of keyboard and mouse events
  * @since LibreOffice 5.1
  */
trait XToolkitRobot extends js.Object {
  def keyPress(aKeyEvent: KeyEvent): scala.Unit
  def keyRelease(aKeyEvent: KeyEvent): scala.Unit
  def mouseMove(aMouseEvent: MouseEvent): scala.Unit
  def mousePress(aMouseEvent: MouseEvent): scala.Unit
  def mouseRelease(aMouseEvent: MouseEvent): scala.Unit
}

