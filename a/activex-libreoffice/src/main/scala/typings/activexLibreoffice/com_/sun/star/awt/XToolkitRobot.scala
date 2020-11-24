package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows injection of keyboard and mouse events
  * @since LibreOffice 5.1
  */
@js.native
trait XToolkitRobot extends js.Object {
  
  def keyPress(aKeyEvent: KeyEvent): Unit = js.native
  
  def keyRelease(aKeyEvent: KeyEvent): Unit = js.native
  
  def mouseMove(aMouseEvent: MouseEvent): Unit = js.native
  
  def mousePress(aMouseEvent: MouseEvent): Unit = js.native
  
  def mouseRelease(aMouseEvent: MouseEvent): Unit = js.native
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
  
  @scala.inline
  implicit class XToolkitRobotOps[Self <: XToolkitRobot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyPress(value: KeyEvent => Unit): Self = this.set("keyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyRelease(value: KeyEvent => Unit): Self = this.set("keyRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseMove(value: MouseEvent => Unit): Self = this.set("mouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMousePress(value: MouseEvent => Unit): Self = this.set("mousePress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseRelease(value: MouseEvent => Unit): Self = this.set("mouseRelease", js.Any.fromFunction1(value))
  }
}
