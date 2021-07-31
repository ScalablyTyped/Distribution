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
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ListClustersResponse | js.Any],
    `finally`: () => js.Promise[ListClustersResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseListCluste = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListCluste]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseListClusteMutableBuilder[Self <: ReadonlyPromiseListCluste] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[ListClustersResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[ListClustersResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
