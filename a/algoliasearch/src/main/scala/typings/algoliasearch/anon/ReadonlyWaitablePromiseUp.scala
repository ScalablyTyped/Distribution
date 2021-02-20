package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.UpdateApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.UpdateApiKeyResponse>> */
@js.native
trait ReadonlyWaitablePromiseUp extends StObject {
  
  def `catch`[TResult](): js.Promise[UpdateApiKeyResponse | TResult] = js.native
  
  def `finally`(): js.Promise[UpdateApiKeyResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromiseUp {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[UpdateApiKeyResponse | js.Any],
    `finally`: () => js.Promise[UpdateApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseUp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseUp]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseUpMutableBuilder[Self <: ReadonlyWaitablePromiseUp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[UpdateApiKeyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[UpdateApiKeyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
