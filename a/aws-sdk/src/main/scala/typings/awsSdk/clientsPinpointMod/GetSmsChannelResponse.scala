package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSmsChannelResponse extends StObject {
  
  var SMSChannelResponse: typings.awsSdk.clientsPinpointMod.SMSChannelResponse
}
object GetSmsChannelResponse {
  
  inline def apply(SMSChannelResponse: SMSChannelResponse): GetSmsChannelResponse = {
    val __obj = js.Dynamic.literal(SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSmsChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSmsChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setSMSChannelResponse(value: SMSChannelResponse): Self = StObject.set(x, "SMSChannelResponse", value.asInstanceOf[js.Any])
  }
}
