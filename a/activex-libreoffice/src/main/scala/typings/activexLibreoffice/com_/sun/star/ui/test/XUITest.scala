package typings.activexLibreoffice.com_.sun.star.ui.test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XUITest extends js.Object {
  
  val TopFocusWindow: XUIObject = js.native
  
  def executeCommand(command: String): Unit = js.native
  
  def getTopFocusWindow(): XUIObject = js.native
}
object XUITest {
  
  @scala.inline
  def apply(TopFocusWindow: XUIObject, executeCommand: String => Unit, getTopFocusWindow: () => XUIObject): XUITest = {
    val __obj = js.Dynamic.literal(TopFocusWindow = TopFocusWindow.asInstanceOf[js.Any], executeCommand = js.Any.fromFunction1(executeCommand), getTopFocusWindow = js.Any.fromFunction0(getTopFocusWindow))
    __obj.asInstanceOf[XUITest]
  }
  
  @scala.inline
  implicit class XUITestOps[Self <: XUITest] (val x: Self) extends AnyVal {
    
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
    def setTopFocusWindow(value: XUIObject): Self = this.set("TopFocusWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteCommand(value: String => Unit): Self = this.set("executeCommand", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTopFocusWindow(value: () => XUIObject): Self = this.set("getTopFocusWindow", js.Any.fromFunction0(value))
  }
}
