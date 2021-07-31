package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelId extends StObject {
  
  var bridgeId: String
  
  var channelId: String
}
object ChannelId {
  
  @scala.inline
  def apply(bridgeId: String, channelId: String): ChannelId = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
  
  @scala.inline
  implicit class ChannelIdMutableBuilder[Self <: ChannelId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
  }
}
