package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.SearchSynonymsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchSynonymsResponse>> */
trait ReadonlyPromiseSearchSyno extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchSynonymsResponse | TResult]
  
  def `finally`(): js.Promise[SearchSynonymsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchSyno {
  
  inline def apply(
    `catch`: () => js.Promise[SearchSynonymsResponse | Any],
    `finally`: () => js.Promise[SearchSynonymsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseSearchSyno = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchSyno]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseSearchSyno] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[SearchSynonymsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SearchSynonymsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
