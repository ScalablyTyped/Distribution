package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelsResponse extends StObject {
  
  var ChannelsResponse: typings.awsSdk.clientsPinpointMod.ChannelsResponse
}
object GetChannelsResponse {
  
  inline def apply(ChannelsResponse: ChannelsResponse): GetChannelsResponse = {
    val __obj = js.Dynamic.literal(ChannelsResponse = ChannelsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsResponse]
  }
  
  extension [Self <: GetChannelsResponse](x: Self) {
    
    inline def setChannelsResponse(value: ChannelsResponse): Self = StObject.set(x, "ChannelsResponse", value.asInstanceOf[js.Any])
  }
}
