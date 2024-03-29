package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApnsChannelResponse extends StObject {
  
  var APNSChannelResponse: typings.awsSdk.clientsPinpointMod.APNSChannelResponse
}
object UpdateApnsChannelResponse {
  
  inline def apply(APNSChannelResponse: APNSChannelResponse): UpdateApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateApnsChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setAPNSChannelResponse(value: APNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
  }
}
