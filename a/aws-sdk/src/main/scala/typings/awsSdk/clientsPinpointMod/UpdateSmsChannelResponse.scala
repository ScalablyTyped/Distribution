package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSmsChannelResponse extends StObject {
  
  var SMSChannelResponse: typings.awsSdk.clientsPinpointMod.SMSChannelResponse
}
object UpdateSmsChannelResponse {
  
  inline def apply(SMSChannelResponse: SMSChannelResponse): UpdateSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSmsChannelResponse]
  }
  
  extension [Self <: UpdateSmsChannelResponse](x: Self) {
    
    inline def setSMSChannelResponse(value: SMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
  }
}
