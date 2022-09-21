package typings.asyncRetryNg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[A](fn: RetryFunction[A]): js.Promise[A] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[A]]
  inline def apply[A](fn: RetryFunction[A], opts: Options): js.Promise[A] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[A]]
  
  @JSImport("async-retry-ng/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var maxTimeout: js.UndefOr[Double] = js.undefined
    
    var minTimeout: js.UndefOr[Double] = js.undefined
    
    var onRetry: js.UndefOr[js.Function1[/* e */ js.Error, Any]] = js.undefined
    
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      inline def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
      
      inline def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
      
      inline def setOnRetry(value: /* e */ js.Error => Any): Self = StObject.set(x, "onRetry", js.Any.fromFunction1(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      inline def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      inline def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ js.Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
