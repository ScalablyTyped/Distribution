package typings.angularQSpread

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait IPromise[T] extends StObject {
    
    /**
      This method can be used as a replacement for then. Similarly, it takes two parameters, a callback when all promises are resolved and a callback for failure. The resolve callback is going to be called with the result of the list of promises passed to $q.all as separate parameters instead of one parameters which is an array.
      * @param successCallback Callback for resolved promise, similar to then's one, but takes multiple parameters instead of single array parameter
      * @param errorCallback Callback for error, the same as for then
      */
    def spread[TResult](successCallback: js.Function1[/* repeated */ js.Any, IPromise[TResult] | TResult]): IPromise[TResult] = js.native
    def spread[TResult](
      successCallback: js.Function1[/* repeated */ js.Any, IPromise[TResult] | TResult],
      errorCallback: js.Function1[/* reason */ js.Any, js.Any]
    ): IPromise[TResult] = js.native
  }
}
