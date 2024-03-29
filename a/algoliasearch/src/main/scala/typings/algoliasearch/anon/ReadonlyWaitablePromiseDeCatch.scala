package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.DeleteResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>> */
trait ReadonlyWaitablePromiseDeCatch extends StObject {
  
  def `catch`[TResult](): js.Promise[DeleteResponse | TResult]
  
  def `finally`(): js.Promise[DeleteResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseDeCatch {
  
  inline def apply(
    `catch`: () => js.Promise[DeleteResponse | Any],
    `finally`: () => js.Promise[DeleteResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseDeCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseDeCatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWaitablePromiseDeCatch] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[DeleteResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[DeleteResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
