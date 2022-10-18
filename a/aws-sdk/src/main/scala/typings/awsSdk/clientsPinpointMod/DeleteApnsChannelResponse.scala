package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApnsChannelResponse extends StObject {
  
  var APNSChannelResponse: typings.awsSdk.clientsPinpointMod.APNSChannelResponse
}
object DeleteApnsChannelResponse {
  
  inline def apply(APNSChannelResponse: APNSChannelResponse): DeleteApnsChannelResponse = {
    val __obj = js.Dynamic.literal(APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsChannelResponse]
  }
  
  extension [Self <: DeleteApnsChannelResponse](x: Self) {
    
    inline def setAPNSChannelResponse(value: APNSChannelResponse): Self = StObject.set(x, "APNSChannelResponse", value.asInstanceOf[js.Any])
  }
}
