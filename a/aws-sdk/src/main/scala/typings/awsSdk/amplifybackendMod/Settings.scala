package typings.awsSdk.amplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /**
    * The supported MFA types.
    */
  var MfaTypes: js.UndefOr[ListOfMfaTypesElement] = js.undefined
  
  /**
    * The body of the SMS message.
    */
  var SmsMessage: js.UndefOr[string] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  extension [Self <: Settings](x: Self) {
    
    inline def setMfaTypes(value: ListOfMfaTypesElement): Self = StObject.set(x, "MfaTypes", value.asInstanceOf[js.Any])
    
    inline def setMfaTypesUndefined: Self = StObject.set(x, "MfaTypes", js.undefined)
    
    inline def setMfaTypesVarargs(value: MfaTypesElement*): Self = StObject.set(x, "MfaTypes", js.Array(value*))
    
    inline def setSmsMessage(value: string): Self = StObject.set(x, "SmsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageUndefined: Self = StObject.set(x, "SmsMessage", js.undefined)
  }
}
