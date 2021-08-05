package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelIdMohClass extends StObject {
  
  var channelId: String
  
  var mohClass: js.UndefOr[String] = js.undefined
}
object ChannelIdMohClass {
  
  inline def apply(channelId: String): ChannelIdMohClass = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdMohClass]
  }
  
  extension [Self <: ChannelIdMohClass](x: Self) {
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setMohClass(value: String): Self = StObject.set(x, "mohClass", value.asInstanceOf[js.Any])
    
    inline def setMohClassUndefined: Self = StObject.set(x, "mohClass", js.undefined)
  }
}
