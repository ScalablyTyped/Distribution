package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMSChannelRequest extends StObject {
  
  /**
    * Specifies whether to enable the SMS channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.undefined
  
  /**
    * The identity that you want to display on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[string] = js.undefined
  
  /**
    * The registered short code that you want to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[string] = js.undefined
}
object SMSChannelRequest {
  
  inline def apply(): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setSenderId(value: string): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
    
    inline def setShortCode(value: string): Self = StObject.set(x, "ShortCode", value.asInstanceOf[js.Any])
    
    inline def setShortCodeUndefined: Self = StObject.set(x, "ShortCode", js.undefined)
  }
}
