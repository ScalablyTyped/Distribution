package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchForFacetValuesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>> */
trait ReadonlyPromiseArraySearc extends StObject {
  
  def `catch`[TResult](): js.Promise[js.Array[SearchForFacetValuesResponse] | TResult]
  
  def `finally`(): js.Promise[js.Array[SearchForFacetValuesResponse]]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseArraySearc {
  
  inline def apply(
    `catch`: () => js.Promise[js.Array[SearchForFacetValuesResponse] | Any],
    `finally`: () => js.Promise[js.Array[SearchForFacetValuesResponse]],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseArraySearc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseArraySearc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseArraySearc] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[js.Array[SearchForFacetValuesResponse] | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[js.Array[SearchForFacetValuesResponse]]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
