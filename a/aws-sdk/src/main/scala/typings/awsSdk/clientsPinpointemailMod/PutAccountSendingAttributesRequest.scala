package typings.awsSdk.clientsPinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccountSendingAttributesRequest extends StObject {
  
  /**
    * Enables or disables your account's ability to send email. Set to true to enable email sending, or set to false to disable email sending.  If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability to send email. 
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.undefined
}
object PutAccountSendingAttributesRequest {
  
  inline def apply(): PutAccountSendingAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountSendingAttributesRequest]
  }
  
  extension [Self <: PutAccountSendingAttributesRequest](x: Self) {
    
    inline def setSendingEnabled(value: Enabled): Self = StObject.set(x, "SendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendingEnabledUndefined: Self = StObject.set(x, "SendingEnabled", js.undefined)
  }
}
