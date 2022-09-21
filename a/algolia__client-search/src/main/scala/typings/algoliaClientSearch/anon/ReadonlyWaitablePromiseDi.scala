package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.DictionaryEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DictionaryEntriesResponse>> */
trait ReadonlyWaitablePromiseDi extends StObject {
  
  def `catch`[TResult](): js.Promise[DictionaryEntriesResponse | TResult]
  
  def `finally`(): js.Promise[DictionaryEntriesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseDi {
  
  inline def apply(
    `catch`: () => js.Promise[DictionaryEntriesResponse | Any],
    `finally`: () => js.Promise[DictionaryEntriesResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromiseDi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseDi]
  }
  
  extension [Self <: ReadonlyWaitablePromiseDi](x: Self) {
    
    inline def setCatch(value: () => js.Promise[DictionaryEntriesResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[DictionaryEntriesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
