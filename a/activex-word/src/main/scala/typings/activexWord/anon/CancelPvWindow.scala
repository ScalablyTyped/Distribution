package typings.activexWord.anon

import typings.activexWord.Word.ProtectedViewWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelPvWindow extends js.Object {
  
  var Cancel: Boolean = js.native
  
  val PvWindow: ProtectedViewWindow = js.native
}
object CancelPvWindow {
  
  @scala.inline
  def apply(Cancel: Boolean, PvWindow: ProtectedViewWindow): CancelPvWindow = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], PvWindow = PvWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelPvWindow]
  }
  
  @scala.inline
  implicit class CancelPvWindowOps[Self <: CancelPvWindow] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPvWindow(value: ProtectedViewWindow): Self = this.set("PvWindow", value.asInstanceOf[js.Any])
  }
}
