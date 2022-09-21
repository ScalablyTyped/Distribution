package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.Synonym
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Synonym>> */
trait ReadonlyPromiseSynonym extends StObject {
  
  def `catch`[TResult](): js.Promise[Synonym | TResult]
  
  def `finally`(): js.Promise[Synonym]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSynonym {
  
  inline def apply(
    `catch`: () => js.Promise[Synonym | Any],
    `finally`: () => js.Promise[Synonym],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseSynonym = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSynonym]
  }
  
  extension [Self <: ReadonlyPromiseSynonym](x: Self) {
    
    inline def setCatch(value: () => js.Promise[Synonym | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[Synonym]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
