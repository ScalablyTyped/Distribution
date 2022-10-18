package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsSettings extends StObject {
  
  /**
    * The contents of the SMS message.
    */
  var SmsMessage: js.UndefOr[string] = js.undefined
}
object SmsSettings {
  
  inline def apply(): SmsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsSettings]
  }
  
  extension [Self <: SmsSettings](x: Self) {
    
    inline def setSmsMessage(value: string): Self = StObject.set(x, "SmsMessage", value.asInstanceOf[js.Any])
    
    inline def setSmsMessageUndefined: Self = StObject.set(x, "SmsMessage", js.undefined)
  }
}
