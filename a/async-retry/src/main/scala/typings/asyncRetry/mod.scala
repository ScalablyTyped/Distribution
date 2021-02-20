package typings.asyncRetry

import typings.retry.mod.OperationOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async-retry", JSImport.Namespace)
  @js.native
  def apply[A](fn: RetryFunction[A]): js.Promise[A] = js.native
  @JSImport("async-retry", JSImport.Namespace)
  @js.native
  def apply[A](fn: RetryFunction[A], opts: Options): js.Promise[A] = js.native
  
  @js.native
  trait Options extends OperationOptions {
    
    var onRetry: js.UndefOr[js.Function2[/* e */ Error, /* attempt */ Double, _]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnRetry(value: (/* e */ Error, /* attempt */ Double) => _): Self = StObject.set(x, "onRetry", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
    }
  }
  
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
