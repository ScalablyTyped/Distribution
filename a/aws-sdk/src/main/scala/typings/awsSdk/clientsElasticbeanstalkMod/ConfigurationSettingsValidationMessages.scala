package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationSettingsValidationMessages extends StObject {
  
  /**
    *  A list of ValidationMessage. 
    */
  var Messages: js.UndefOr[ValidationMessagesList] = js.undefined
}
object ConfigurationSettingsValidationMessages {
  
  inline def apply(): ConfigurationSettingsValidationMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsValidationMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationSettingsValidationMessages] (val x: Self) extends AnyVal {
    
    inline def setMessages(value: ValidationMessagesList): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    inline def setMessagesVarargs(value: ValidationMessage*): Self = StObject.set(x, "Messages", js.Array(value*))
  }
}
