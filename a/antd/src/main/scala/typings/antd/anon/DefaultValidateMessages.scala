package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValidateMessages extends StObject {
  
  var defaultValidateMessages: typings.rcFieldForm.interfaceMod.ValidateMessages
  
  var optional: js.UndefOr[String] = js.undefined
}
object DefaultValidateMessages {
  
  inline def apply(defaultValidateMessages: typings.rcFieldForm.interfaceMod.ValidateMessages): DefaultValidateMessages = {
    val __obj = js.Dynamic.literal(defaultValidateMessages = defaultValidateMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValidateMessages]
  }
  
  extension [Self <: DefaultValidateMessages](x: Self) {
    
    inline def setDefaultValidateMessages(value: typings.rcFieldForm.interfaceMod.ValidateMessages): Self = StObject.set(x, "defaultValidateMessages", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: String): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
