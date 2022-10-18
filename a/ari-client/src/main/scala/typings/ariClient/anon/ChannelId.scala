package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelId extends StObject {
  
  var channelId: String
}
object ChannelId {
  
  inline def apply(channelId: String): ChannelId = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelId]
  }
  
  extension [Self <: ChannelId](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
  }
}
