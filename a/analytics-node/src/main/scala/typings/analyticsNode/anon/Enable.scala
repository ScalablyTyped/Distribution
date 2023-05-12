package typings.analyticsNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enable extends StObject {
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var errorHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  
  var flushAt: js.UndefOr[Double] = js.undefined
  
  var flushInterval: js.UndefOr[Double] = js.undefined
  
  var flushed: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double | String] = js.undefined
}
object Enable {
  
  inline def apply(): Enable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setErrorHandler(value: /* err */ js.Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setFlushAt(value: Double): Self = StObject.set(x, "flushAt", value.asInstanceOf[js.Any])
    
    inline def setFlushAtUndefined: Self = StObject.set(x, "flushAt", js.undefined)
    
    inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    inline def setFlushed(value: Boolean): Self = StObject.set(x, "flushed", value.asInstanceOf[js.Any])
    
    inline def setFlushedUndefined: Self = StObject.set(x, "flushed", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
