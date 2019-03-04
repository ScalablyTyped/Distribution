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
    keyPress: js.Function1[KeyEvent, scala.Unit],
    keyRelease: js.Function1[KeyEvent, scala.Unit],
    mouseMove: js.Function1[MouseEvent, scala.Unit],
    mousePress: js.Function1[MouseEvent, scala.Unit],
    mouseRelease: js.Function1[MouseEvent, scala.Unit]
  ): XToolkitRobot = {
    val __obj = js.Dynamic.literal(keyPress = keyPress, keyRelease = keyRelease, mouseMove = mouseMove, mousePress = mousePress, mouseRelease = mouseRelease)
  
    __obj.asInstanceOf[XToolkitRobot]
  }
}

