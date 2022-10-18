package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeIdChannel extends StObject {
  
  var bridgeId: String
  
  var channel: String | js.Array[String]
}
object BridgeIdChannel {
  
  inline def apply(bridgeId: String, channel: String | js.Array[String]): BridgeIdChannel = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeIdChannel]
  }
  
  extension [Self <: BridgeIdChannel](x: Self) {
    
    inline def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String | js.Array[String]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelVarargs(value: String*): Self = StObject.set(x, "channel", js.Array(value*))
  }
}
