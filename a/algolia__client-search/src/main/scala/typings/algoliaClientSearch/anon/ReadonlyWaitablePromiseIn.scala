package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.IndexOperationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>> */
trait ReadonlyWaitablePromiseIn extends StObject {
  
  def `catch`[TResult](): js.Promise[IndexOperationResponse | TResult]
  
  def `finally`(): js.Promise[IndexOperationResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseIn {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[IndexOperationResponse | js.Any],
    `finally`: () => js.Promise[IndexOperationResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseIn]
  }
  
  @scala.inline
  implicit class ReadonlyWaitablePromiseInMutableBuilder[Self <: ReadonlyWaitablePromiseIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[IndexOperationResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[IndexOperationResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
