package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.ListClustersResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListClustersResponse>> */
trait ReadonlyPromiseListCluste extends StObject {
  
  def `catch`[TResult](): js.Promise[ListClustersResponse | TResult]
  
  def `finally`(): js.Promise[ListClustersResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseListCluste {
  
  inline def apply(
    `catch`: () => js.Promise[ListClustersResponse | Any],
    `finally`: () => js.Promise[ListClustersResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseListCluste = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListCluste]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseListCluste] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[ListClustersResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[ListClustersResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
