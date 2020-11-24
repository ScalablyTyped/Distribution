package typings.activexOffice.anon

import typings.activexOffice.Office.CommandBarComboBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ctrl extends js.Object {
  
  val Ctrl: CommandBarComboBox = js.native
}
object Ctrl {
  
  @scala.inline
  def apply(Ctrl: CommandBarComboBox): Ctrl = {
    val __obj = js.Dynamic.literal(Ctrl = Ctrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ctrl]
  }
  
  @scala.inline
  implicit class CtrlOps[Self <: Ctrl] (val x: Self) extends AnyVal {
    
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
    def setCtrl(value: CommandBarComboBox): Self = this.set("Ctrl", value.asInstanceOf[js.Any])
  }
}
