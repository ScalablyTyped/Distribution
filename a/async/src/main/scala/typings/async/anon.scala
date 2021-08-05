package typings.async

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error[E, T] extends StObject {
    
    var error: js.UndefOr[E] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object Error {
    
    inline def apply[E, T](): Error[E, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error[E, T]]
    }
    
    extension [Self <: Error[?, ?], E, T](x: Self & (Error[E, T])) {
      
      inline def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined async.async.RetryOptions & {  arity :number | undefined} */
  trait RetryOptionsaritynumberun extends StObject {
    
    var arity: js.UndefOr[Double] = js.undefined
    
    var errorFilter: js.UndefOr[js.Function1[/* error */ typings.std.Error, Boolean]] = js.undefined
    
    var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.undefined
    
    var times: js.UndefOr[Double] = js.undefined
  }
  object RetryOptionsaritynumberun {
    
    inline def apply(): RetryOptionsaritynumberun = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptionsaritynumberun]
    }
    
    extension [Self <: RetryOptionsaritynumberun](x: Self) {
      
      inline def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      inline def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
      
      inline def setErrorFilter(value: /* error */ typings.std.Error => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      inline def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
      
      inline def setInterval(value: Double | (js.Function1[/* retryCount */ Double, Double])): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalFunction1(value: /* retryCount */ Double => Double): Self = StObject.set(x, "interval", js.Any.fromFunction1(value))
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      inline def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
}
