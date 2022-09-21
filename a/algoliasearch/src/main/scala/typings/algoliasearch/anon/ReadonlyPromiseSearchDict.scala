package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.SearchDictionaryEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchDictionaryEntriesResponse>> */
trait ReadonlyPromiseSearchDict extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchDictionaryEntriesResponse | TResult]
  
  def `finally`(): js.Promise[SearchDictionaryEntriesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchDict {
  
  inline def apply(
    `catch`: () => js.Promise[SearchDictionaryEntriesResponse | Any],
    `finally`: () => js.Promise[SearchDictionaryEntriesResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseSearchDict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchDict]
  }
  
  extension [Self <: ReadonlyPromiseSearchDict](x: Self) {
    
    inline def setCatch(value: () => js.Promise[SearchDictionaryEntriesResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SearchDictionaryEntriesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
