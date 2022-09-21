package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.SaveSynonymsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>> */
trait ReadonlyWaitablePromiseSaFinally extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveSynonymsResponse | TResult]
  
  def `finally`(): js.Promise[SaveSynonymsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSaFinally {
  
  inline def apply(
    `catch`: () => js.Promise[SaveSynonymsResponse | Any],
    `finally`: () => js.Promise[SaveSynonymsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseSaFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaFinally]
  }
  
  extension [Self <: ReadonlyWaitablePromiseSaFinally](x: Self) {
    
    inline def setCatch(value: () => js.Promise[SaveSynonymsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SaveSynonymsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
