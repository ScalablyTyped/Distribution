package typings.activexOffice.anon

import typings.activexOffice.Office.CommandBarButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelDefault extends js.Object {
  
  var CancelDefault: Boolean = js.native
  
  val Ctrl: CommandBarButton = js.native
}
object CancelDefault {
  
  @scala.inline
  def apply(CancelDefault: Boolean, Ctrl: CommandBarButton): CancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], Ctrl = Ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDefault]
  }
  
  @scala.inline
  implicit class CancelDefaultOps[Self <: CancelDefault] (val x: Self) extends AnyVal {
    
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
    def setCancelDefault(value: Boolean): Self = this.set("CancelDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrl(value: CommandBarButton): Self = this.set("Ctrl", value.asInstanceOf[js.Any])
  }
}
