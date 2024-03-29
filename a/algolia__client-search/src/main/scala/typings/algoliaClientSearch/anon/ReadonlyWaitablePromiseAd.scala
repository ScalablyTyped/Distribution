package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.AddApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.AddApiKeyResponse>> */
trait ReadonlyWaitablePromiseAd extends StObject {
  
  def `catch`[TResult](): js.Promise[AddApiKeyResponse | TResult]
  
  def `finally`(): js.Promise[AddApiKeyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseAd {
  
  inline def apply(
    `catch`: () => js.Promise[AddApiKeyResponse | Any],
    `finally`: () => js.Promise[AddApiKeyResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseAd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseAd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWaitablePromiseAd] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[AddApiKeyResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[AddApiKeyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
