package typings.async

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error[E, T] extends StObject {
    
    var error: js.UndefOr[E] = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  object Error {
    
    @scala.inline
    def apply[E, T](): Error[E, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error[E, T]]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error[_, _], E, T] (val x: Self with (Error[E, T])) extends AnyVal {
      
      @scala.inline
      def setError(value: E): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined async.async.RetryOptions & {  arity :number | undefined} */
  @js.native
  trait RetryOptionsaritynumberun extends StObject {
    
    var arity: js.UndefOr[Double] = js.native
    
    var errorFilter: js.UndefOr[js.Function1[/* error */ typings.std.Error, Boolean]] = js.native
    
    var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.native
    
    var times: js.UndefOr[Double] = js.native
  }
  object RetryOptionsaritynumberun {
    
    @scala.inline
    def apply(): RetryOptionsaritynumberun = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptionsaritynumberun]
    }
    
    @scala.inline
    implicit class RetryOptionsaritynumberunMutableBuilder[Self <: RetryOptionsaritynumberun] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArity(value: Double): Self = StObject.set(x, "arity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArityUndefined: Self = StObject.set(x, "arity", js.undefined)
      
      @scala.inline
      def setErrorFilter(value: /* error */ typings.std.Error => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
      
      @scala.inline
      def setInterval(value: Double | (js.Function1[/* retryCount */ Double, Double])): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalFunction1(value: /* retryCount */ Double => Double): Self = StObject.set(x, "interval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
}
