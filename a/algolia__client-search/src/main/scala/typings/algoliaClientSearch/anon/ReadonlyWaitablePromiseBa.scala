package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.BatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.BatchResponse>> */
trait ReadonlyWaitablePromiseBa extends StObject {
  
  def `catch`[TResult](): js.Promise[BatchResponse | TResult]
  
  def `finally`(): js.Promise[BatchResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseBa {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[BatchResponse | js.Any],
    `finally`: () => js.Promise[BatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseBa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseBa]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseBaMutableBuilder[Self <: ReadonlyWaitablePromiseBa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[BatchResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[BatchResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
