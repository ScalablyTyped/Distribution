package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeout extends StObject {
  
  var caller: js.UndefOr[String] = js.undefined
  
  var channelId: String
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Timeout {
  
  inline def apply(channelId: String): Timeout = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  
  extension [Self <: Timeout](x: Self) {
    
    inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
