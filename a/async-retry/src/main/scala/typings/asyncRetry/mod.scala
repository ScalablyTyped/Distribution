package typings.asyncRetry

import typings.retry.mod.WrapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Retrying made simple, easy, and async.
    *
    * @example
    * import retry = require('async-retry');
    * import fetch from 'node-fetch';
    *
    * await retry(
    *   async (bail) => {
    *     // if anything throws, we retry
    *     const res = await fetch('https://google.com');
    *
    *     if (403 === res.status) {
    *       // don't retry upon 403
    *       bail(new Error('Unauthorized'));
    *       return;
    *     }
    *
    *     const data = await res.text();
    *     return data.substr(0, 500);
    *   },
    *   {
    *     retries: 5,
    *   }
    * );
    */
  inline def apply[TRet](fn: RetryFunction[TRet]): js.Promise[TRet] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TRet]]
  inline def apply[TRet](fn: RetryFunction[TRet], opts: Options): js.Promise[TRet] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TRet]]
  
  @JSImport("async-retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with WrapOptions {
    
    /**
      * An optional function that is invoked after a new retry is performed. It's passed the
      * `Error` that triggered it as a parameter.
      */
    var onRetry: js.UndefOr[js.Function2[/* e */ js.Error, /* attempt */ Double, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOnRetry(value: (/* e */ js.Error, /* attempt */ Double) => Any): Self = StObject.set(x, "onRetry", js.Any.fromFunction2(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
    }
  }
  
  /**
    * @param bail A function you can invoke to abort the retrying (bail).
    * @param attempt The attempt number. The absolute first attempt (before any retries) is `1`.
    */
  type RetryFunction[TRet] = js.Function2[
    /* bail */ js.Function1[/* e */ js.Error, Unit], 
    /* attempt */ Double, 
    TRet | js.Promise[TRet]
  ]
}
