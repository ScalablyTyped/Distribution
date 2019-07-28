package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows injection of keyboard and mouse events
  * @since LibreOffice 5.1
  */
trait XToolkitRobot extends js.Object {
  def keyPress(aKeyEvent: KeyEvent): Unit
  def keyRelease(aKeyEvent: KeyEvent): Unit
  def mouseMove(aMouseEvent: MouseEvent): Unit
  def mousePress(aMouseEvent: MouseEvent): Unit
  def mouseRelease(aMouseEvent: MouseEvent): Unit
}

object XToolkitRobot {
  @scala.inline
  def apply(
    keyPress: KeyEvent => Unit,
    keyRelease: KeyEvent => Unit,
    mouseMove: MouseEvent => Unit,
    mousePress: MouseEvent => Unit,
    mouseRelease: MouseEvent => Unit
  ): XToolkitRobot = {
    val __obj = js.Dynamic.literal(keyPress = js.Any.fromFunction1(keyPress), keyRelease = js.Any.fromFunction1(keyRelease), mouseMove = js.Any.fromFunction1(mouseMove), mousePress = js.Any.fromFunction1(mousePress), mouseRelease = js.Any.fromFunction1(mouseRelease))
  
    __obj.asInstanceOf[XToolkitRobot]
  }
}

