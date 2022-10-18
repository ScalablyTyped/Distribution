package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeIdChannelId extends StObject {
  
  var bridgeId: String
  
  var channelId: String
}
object BridgeIdChannelId {
  
  inline def apply(bridgeId: String, channelId: String): BridgeIdChannelId = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeIdChannelId]
  }
  
  extension [Self <: BridgeIdChannelId](x: Self) {
    
    inline def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
  }
}
