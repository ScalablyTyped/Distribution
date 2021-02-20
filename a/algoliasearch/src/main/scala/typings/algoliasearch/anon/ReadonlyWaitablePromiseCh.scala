package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.ChunkedBatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>> */
@js.native
trait ReadonlyWaitablePromiseCh extends StObject {
  
  def `catch`[TResult](): js.Promise[ChunkedBatchResponse | TResult] = js.native
  
  def `finally`(): js.Promise[ChunkedBatchResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyWaitablePromiseCh {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ChunkedBatchResponse | js.Any],
    `finally`: () => js.Promise[ChunkedBatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseCh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseCh]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseChMutableBuilder[Self <: ReadonlyWaitablePromiseCh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[ChunkedBatchResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[ChunkedBatchResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
