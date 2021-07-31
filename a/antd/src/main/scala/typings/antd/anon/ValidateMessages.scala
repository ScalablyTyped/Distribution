package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateMessages extends StObject {
  
  var requiredMark: js.UndefOr[typings.antd.formFormMod.RequiredMark] = js.undefined
  
  var validateMessages: js.UndefOr[typings.rcFieldForm.interfaceMod.ValidateMessages] = js.undefined
}
object ValidateMessages {
  
  @scala.inline
  def apply(): ValidateMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateMessages]
  }
  
  @scala.inline
  implicit class ValidateMessagesMutableBuilder[Self <: ValidateMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequiredMark(value: typings.antd.formFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    @scala.inline
    def setValidateMessages(value: typings.rcFieldForm.interfaceMod.ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
  }
}
