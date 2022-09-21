package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.DeleteApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteApiKeyResponse>> */
trait ReadonlyWaitablePromiseDeCatch extends StObject {
  
  def `catch`[TResult](): js.Promise[DeleteApiKeyResponse | TResult]
  
  def `finally`(): js.Promise[DeleteApiKeyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseDeCatch {
  
  inline def apply(
    `catch`: () => js.Promise[DeleteApiKeyResponse | Any],
    `finally`: () => js.Promise[DeleteApiKeyResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseDeCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseDeCatch]
  }
  
  extension [Self <: ReadonlyWaitablePromiseDeCatch](x: Self) {
    
    inline def setCatch(value: () => js.Promise[DeleteApiKeyResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[DeleteApiKeyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
