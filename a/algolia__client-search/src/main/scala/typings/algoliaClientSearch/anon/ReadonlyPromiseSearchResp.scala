package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.Rule
import typings.algoliaClientSearch.mod.SearchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<@algolia/client-search.@algolia/client-search.Rule>>> */
trait ReadonlyPromiseSearchResp extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchResponse[Rule] | TResult]
  
  def `finally`(): js.Promise[SearchResponse[Rule]]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchResp {
  
  inline def apply(
    `catch`: () => js.Promise[SearchResponse[Rule] | js.Any],
    `finally`: () => js.Promise[SearchResponse[Rule]],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSearchResp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchResp]
  }
  
  extension [Self <: ReadonlyPromiseSearchResp](x: Self) {
    
    inline def setCatch(value: () => js.Promise[SearchResponse[Rule] | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SearchResponse[Rule]]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
