package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateMessages extends js.Object {
  
  var requiredMark: js.UndefOr[typings.antd.formFormMod.RequiredMark] = js.native
  
  var validateMessages: js.UndefOr[typings.rcFieldForm.interfaceMod.ValidateMessages] = js.native
}
object ValidateMessages {
  
  @scala.inline
  def apply(): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessages]
  }
  
  @scala.inline
  implicit class ValidateMessagesOps[Self <: ValidateMessages] (val x: Self) extends AnyVal {
    
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
    def setRequiredMark(value: typings.antd.formFormMod.RequiredMark): Self = this.set("requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredMark: Self = this.set("requiredMark", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: typings.rcFieldForm.interfaceMod.ValidateMessages): Self = this.set("validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateMessages: Self = this.set("validateMessages", js.undefined)
  }
}
