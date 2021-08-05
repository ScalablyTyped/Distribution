package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.SaveRulesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>> */
trait ReadonlyWaitablePromiseSaWait extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveRulesResponse | TResult]
  
  def `finally`(): js.Promise[SaveRulesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSaWait {
  
  inline def apply(
    `catch`: () => js.Promise[SaveRulesResponse | js.Any],
    `finally`: () => js.Promise[SaveRulesResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseSaWait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaWait]
  }
  
  extension [Self <: ReadonlyWaitablePromiseSaWait](x: Self) {
    
    inline def setCatch(value: () => js.Promise[SaveRulesResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SaveRulesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
