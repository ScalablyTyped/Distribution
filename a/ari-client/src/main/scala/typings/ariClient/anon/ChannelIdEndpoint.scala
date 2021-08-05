package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdEndpoint extends StObject {
  
  var channelId: String
  
  var endpoint: String
}
object ChannelIdEndpoint {
  
  inline def apply(channelId: String, endpoint: String): ChannelIdEndpoint = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdEndpoint]
  }
  
  extension [Self <: ChannelIdEndpoint](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
