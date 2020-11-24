package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValidateMessages extends js.Object {
  
  var defaultValidateMessages: typings.rcFieldForm.interfaceMod.ValidateMessages = js.native
  
  var optional: js.UndefOr[String] = js.native
}
object DefaultValidateMessages {
  
  @scala.inline
  def apply(defaultValidateMessages: typings.rcFieldForm.interfaceMod.ValidateMessages): DefaultValidateMessages = {
    val __obj = js.Dynamic.literal(defaultValidateMessages = defaultValidateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValidateMessages]
  }
  
  @scala.inline
  implicit class DefaultValidateMessagesOps[Self <: DefaultValidateMessages] (val x: Self) extends AnyVal {
    
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
    def setDefaultValidateMessages(value: typings.rcFieldForm.interfaceMod.ValidateMessages): Self = this.set("defaultValidateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: String): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
  }
}
