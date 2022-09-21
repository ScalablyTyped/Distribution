package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.SetSettingsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SetSettingsResponse>> */
trait ReadonlyWaitablePromiseSe extends StObject {
  
  def `catch`[TResult](): js.Promise[SetSettingsResponse | TResult]
  
  def `finally`(): js.Promise[SetSettingsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSe {
  
  inline def apply(
    `catch`: () => js.Promise[SetSettingsResponse | Any],
    `finally`: () => js.Promise[SetSettingsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseSe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSe]
  }
  
  extension [Self <: ReadonlyWaitablePromiseSe](x: Self) {
    
    inline def setCatch(value: () => js.Promise[SetSettingsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SetSettingsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
