package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.MultipleBatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.MultipleBatchResponse>> */
trait ReadonlyWaitablePromiseMu extends StObject {
  
  def `catch`[TResult](): js.Promise[MultipleBatchResponse | TResult]
  
  def `finally`(): js.Promise[MultipleBatchResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseMu {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[MultipleBatchResponse | js.Any],
    `finally`: () => js.Promise[MultipleBatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseMu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseMu]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseMuMutableBuilder[Self <: ReadonlyWaitablePromiseMu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[MultipleBatchResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[MultipleBatchResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
