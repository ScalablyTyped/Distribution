package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchSynonymsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchSynonymsResponse>> */
@js.native
trait ReadonlyPromiseSearchSyno extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchSynonymsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[SearchSynonymsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseSearchSyno {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SearchSynonymsResponse | js.Any],
    `finally`: () => js.Promise[SearchSynonymsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSearchSyno = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchSyno]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseSearchSynoMutableBuilder[Self <: ReadonlyPromiseSearchSyno] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[SearchSynonymsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[SearchSynonymsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
