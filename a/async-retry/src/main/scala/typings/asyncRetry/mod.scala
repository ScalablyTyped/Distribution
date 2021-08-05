package typings.asyncRetry

import typings.retry.mod.OperationOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[A](fn: RetryFunction[A]): js.Promise[A] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[A]]
  inline def apply[A](fn: RetryFunction[A], opts: Options): js.Promise[A] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[A]]
  
  @JSImport("async-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with OperationOptions {
    
    var onRetry: js.UndefOr[js.Function2[/* e */ Error, /* attempt */ Double, js.Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnRetry(value: (/* e */ Error, /* attempt */ Double) => js.Any): Self = StObject.set(x, "onRetry", js.Any.fromFunction2(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
    }
  }
  
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
