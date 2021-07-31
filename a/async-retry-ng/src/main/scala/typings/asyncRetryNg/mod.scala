package typings.asyncRetryNg

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[A](fn: RetryFunction[A]): js.Promise[A] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[A]]
  @scala.inline
  def apply[A](fn: RetryFunction[A], opts: Options): js.Promise[A] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[A]]
  
  @JSImport("async-retry-ng/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var maxTimeout: js.UndefOr[Double] = js.undefined
    
    var minTimeout: js.UndefOr[Double] = js.undefined
    
    var onRetry: js.UndefOr[js.Function1[/* e */ Error, js.Any]] = js.undefined
    
    var randomize: js.UndefOr[Boolean] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
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
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
      
      @scala.inline
      def setMinTimeout(value: Double): Self = StObject.set(x, "minTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinTimeoutUndefined: Self = StObject.set(x, "minTimeout", js.undefined)
      
      @scala.inline
      def setOnRetry(value: /* e */ Error => js.Any): Self = StObject.set(x, "onRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      @scala.inline
      def setRandomize(value: Boolean): Self = StObject.set(x, "randomize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizeUndefined: Self = StObject.set(x, "randomize", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  type RetryFunction[A] = js.Function2[
    /* bail */ js.Function1[/* e */ Error, Unit], 
    /* attempt */ Double, 
    A | js.Promise[A]
  ]
}
