package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.RestoreApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.RestoreApiKeyResponse>> */
@js.native
trait ReadonlyWaitablePromiseRe extends StObject {
  
  def `catch`[TResult](): js.Promise[RestoreApiKeyResponse | TResult] = js.native
  
  def `finally`(): js.Promise[RestoreApiKeyResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromiseRe {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[RestoreApiKeyResponse | js.Any],
    `finally`: () => js.Promise[RestoreApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseRe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseRe]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseReMutableBuilder[Self <: ReadonlyWaitablePromiseRe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[RestoreApiKeyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[RestoreApiKeyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
