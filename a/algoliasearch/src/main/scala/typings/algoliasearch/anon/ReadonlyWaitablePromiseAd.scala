package typings.algoliasearch.anon

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
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[AddApiKeyResponse | js.Any],
    `finally`: () => js.Promise[AddApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseAd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseAd]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseAdMutableBuilder[Self <: ReadonlyWaitablePromiseAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[AddApiKeyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[AddApiKeyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
