package typings.awsGreengrassCoreSdk.streamManagerClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamManagerClientOptions extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[StreamManagerLogger] = js.undefined
  
  var onConnectCb: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var onErrorCb: js.UndefOr[js.Function1[/* e */ js.Error, Any]] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object StreamManagerClientOptions {
  
  inline def apply(): StreamManagerClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamManagerClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamManagerClientOptions] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLogger(value: StreamManagerLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setOnConnectCb(value: () => Any): Self = StObject.set(x, "onConnectCb", js.Any.fromFunction0(value))
    
    inline def setOnConnectCbUndefined: Self = StObject.set(x, "onConnectCb", js.undefined)
    
    inline def setOnErrorCb(value: /* e */ js.Error => Any): Self = StObject.set(x, "onErrorCb", js.Any.fromFunction1(value))
    
    inline def setOnErrorCbUndefined: Self = StObject.set(x, "onErrorCb", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
