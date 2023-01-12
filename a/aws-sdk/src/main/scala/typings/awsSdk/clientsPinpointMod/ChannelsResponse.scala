package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsResponse extends StObject {
  
  /**
    * A map that contains a multipart response for each channel. For each item in this object, the ChannelType is the key and the Channel is the value.
    */
  var Channels: MapOfChannelResponse
}
object ChannelsResponse {
  
  inline def apply(Channels: MapOfChannelResponse): ChannelsResponse = {
    val __obj = js.Dynamic.literal(Channels = Channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelsResponse] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: MapOfChannelResponse): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
  }
}
