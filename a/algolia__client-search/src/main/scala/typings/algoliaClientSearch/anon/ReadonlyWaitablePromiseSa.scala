package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SaveRulesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>> */
trait ReadonlyWaitablePromiseSa extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveRulesResponse | TResult]
  
  def `finally`(): js.Promise[SaveRulesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSa {
  
  inline def apply(
    `catch`: () => js.Promise[SaveRulesResponse | Any],
    `finally`: () => js.Promise[SaveRulesResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseSa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWaitablePromiseSa] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[SaveRulesResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SaveRulesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
