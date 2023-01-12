package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caller extends StObject {
  
  var caller: js.UndefOr[String] = js.undefined
  
  var channelId: String
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Caller {
  
  inline def apply(channelId: String): Caller = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caller]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Caller] (val x: Self) extends AnyVal {
    
    inline def setCaller(value: String): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
