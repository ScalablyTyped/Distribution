package typings.algoliasearch.anon

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
  
  inline def apply(
    `catch`: () => js.Promise[IndexOperationResponse | Any],
    `finally`: () => js.Promise[IndexOperationResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseIn]
  }
  
  extension [Self <: ReadonlyWaitablePromiseIn](x: Self) {
    
    inline def setCatch(value: () => js.Promise[IndexOperationResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[IndexOperationResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
