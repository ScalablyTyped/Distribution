package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdDirection extends StObject {
  
  var channelId: String
  
  var direction: js.UndefOr[String] = js.undefined
}
object ChannelIdDirection {
  
  inline def apply(channelId: String): ChannelIdDirection = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdDirection]
  }
  
  extension [Self <: ChannelIdDirection](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
  }
}
