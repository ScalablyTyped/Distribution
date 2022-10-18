package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var channel: String | js.Array[String]
}
object Channel {
  
  inline def apply(channel: String | js.Array[String]): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannel(value: String | js.Array[String]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelVarargs(value: String*): Self = StObject.set(x, "channel", js.Array(value*))
  }
}
