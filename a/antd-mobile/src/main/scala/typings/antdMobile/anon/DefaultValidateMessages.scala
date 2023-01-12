package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValidateMessages extends StObject {
  
  var defaultValidateMessages: Default
  
  var optional: String
  
  var required: String
}
object DefaultValidateMessages {
  
  inline def apply(defaultValidateMessages: Default, optional: String, required: String): DefaultValidateMessages = {
    val __obj = js.Dynamic.literal(defaultValidateMessages = defaultValidateMessages.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValidateMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValidateMessages] (val x: Self) extends AnyVal {
    
    inline def setDefaultValidateMessages(value: Default): Self = StObject.set(x, "defaultValidateMessages", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: String): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
