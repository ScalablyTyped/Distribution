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
  
  inline def apply(
    `catch`: () => js.Promise[BatchResponse | Any],
    `finally`: () => js.Promise[BatchResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseBa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseBa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWaitablePromiseBa] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[BatchResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[BatchResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
