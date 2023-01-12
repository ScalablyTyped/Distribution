package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.ChunkedBatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>> */
trait ReadonlyWaitablePromiseCh extends StObject {
  
  def `catch`[TResult](): js.Promise[ChunkedBatchResponse | TResult]
  
  def `finally`(): js.Promise[ChunkedBatchResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseCh {
  
  inline def apply(
    `catch`: () => js.Promise[ChunkedBatchResponse | Any],
    `finally`: () => js.Promise[ChunkedBatchResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseCh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseCh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWaitablePromiseCh] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[ChunkedBatchResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[ChunkedBatchResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
