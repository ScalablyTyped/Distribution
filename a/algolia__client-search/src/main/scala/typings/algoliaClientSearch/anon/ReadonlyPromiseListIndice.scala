package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ListIndicesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListIndicesResponse>> */
trait ReadonlyPromiseListIndice extends StObject {
  
  def `catch`[TResult](): js.Promise[ListIndicesResponse | TResult]
  
  def `finally`(): js.Promise[ListIndicesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseListIndice {
  
  inline def apply(
    `catch`: () => js.Promise[ListIndicesResponse | Any],
    `finally`: () => js.Promise[ListIndicesResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseListIndice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListIndice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseListIndice] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[ListIndicesResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[ListIndicesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
