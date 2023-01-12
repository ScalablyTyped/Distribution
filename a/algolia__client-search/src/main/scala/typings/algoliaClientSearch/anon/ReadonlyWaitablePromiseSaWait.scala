package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SaveSynonymResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymResponse>> */
trait ReadonlyWaitablePromiseSaWait extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveSynonymResponse | TResult]
  
  def `finally`(): js.Promise[SaveSynonymResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSaWait {
  
  inline def apply(
    `catch`: () => js.Promise[SaveSynonymResponse | Any],
    `finally`: () => js.Promise[SaveSynonymResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseSaWait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaWait]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyWaitablePromiseSaWait] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[SaveSynonymResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SaveSynonymResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
