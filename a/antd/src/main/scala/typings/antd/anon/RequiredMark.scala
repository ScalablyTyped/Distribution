package typings.antd.anon

import typings.rcFieldForm.esInterfaceMod.ValidateMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredMark extends StObject {
  
  var colon: js.UndefOr[Boolean] = js.undefined
  
  var requiredMark: js.UndefOr[typings.antd.libFormFormMod.RequiredMark] = js.undefined
  
  var validateMessages: js.UndefOr[ValidateMessages] = js.undefined
}
object RequiredMark {
  
  inline def apply(): RequiredMark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequiredMark]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredMark] (val x: Self) extends AnyVal {
    
    inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
    
    inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
    
    inline def setRequiredMark(value: typings.antd.libFormFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
    
    inline def setValidateMessages(value: ValidateMessages): Self = StObject.set(x, "validateMessages", value.asInstanceOf[js.Any])
    
    inline def setValidateMessagesUndefined: Self = StObject.set(x, "validateMessages", js.undefined)
  }
}
