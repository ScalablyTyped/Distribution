package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlMouseButton
import typings.activexOutlook.Outlook.OlShiftState
import typings.activexStdole.stdole.OLE_XPOS_CONTAINER
import typings.activexStdole.stdole.OLE_YPOS_CONTAINER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button extends js.Object {
  
  val Button: OlMouseButton = js.native
  
  val Shift: OlShiftState = js.native
  
  val X: OLE_XPOS_CONTAINER = js.native
  
  val Y: OLE_YPOS_CONTAINER = js.native
}
object Button {
  
  @scala.inline
  def apply(Button: OlMouseButton, Shift: OlShiftState, X: OLE_XPOS_CONTAINER, Y: OLE_YPOS_CONTAINER): Button = {
    val __obj = js.Dynamic.literal(Button = Button.asInstanceOf[js.Any], Shift = Shift.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    
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
    def setButton(value: OlMouseButton): Self = this.set("Button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShift(value: OlShiftState): Self = this.set("Shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: OLE_XPOS_CONTAINER): Self = this.set("X", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: OLE_YPOS_CONTAINER): Self = this.set("Y", value.asInstanceOf[js.Any])
  }
}
