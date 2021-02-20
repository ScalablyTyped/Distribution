package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelIdEndpoint extends StObject {
  
  var channelId: String = js.native
  
  var endpoint: String = js.native
}
object ChannelIdEndpoint {
  
  @scala.inline
  def apply(channelId: String, endpoint: String): ChannelIdEndpoint = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdEndpoint]
  }
  
  @scala.inline
  implicit class ChannelIdEndpointMutableBuilder[Self <: ChannelIdEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
