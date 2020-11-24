package typings.agGrid.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EPopup extends js.Object {
  
  var ePopup: HTMLElement = js.native
  
  var eventSource: js.Any = js.native
}
object EPopup {
  
  @scala.inline
  def apply(ePopup: HTMLElement, eventSource: js.Any): EPopup = {
    val __obj = js.Dynamic.literal(ePopup = ePopup.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EPopup]
  }
  
  @scala.inline
  implicit class EPopupOps[Self <: EPopup] (val x: Self) extends AnyVal {
    
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
    def setEPopup(value: HTMLElement): Self = this.set("ePopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSource(value: js.Any): Self = this.set("eventSource", value.asInstanceOf[js.Any])
  }
}
