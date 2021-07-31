package typings.algoliasearch.anon

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
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ListIndicesResponse | js.Any],
    `finally`: () => js.Promise[ListIndicesResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseListIndice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListIndice]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseListIndiceMutableBuilder[Self <: ReadonlyPromiseListIndice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[ListIndicesResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[ListIndicesResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
