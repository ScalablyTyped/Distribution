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

object XToolkitRobot {
  @scala.inline
  def apply(
    keyPress: KeyEvent => scala.Unit,
    keyRelease: KeyEvent => scala.Unit,
    mouseMove: MouseEvent => scala.Unit,
    mousePress: MouseEvent => scala.Unit,
    mouseRelease: MouseEvent => scala.Unit
  ): XToolkitRobot = {
    val __obj = js.Dynamic.literal(keyPress = js.Any.fromFunction1(keyPress), keyRelease = js.Any.fromFunction1(keyRelease), mouseMove = js.Any.fromFunction1(mouseMove), mousePress = js.Any.fromFunction1(mousePress), mouseRelease = js.Any.fromFunction1(mouseRelease))
  
    __obj.asInstanceOf[XToolkitRobot]
  }
}

