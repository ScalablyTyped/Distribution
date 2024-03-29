package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Rule>> */
trait ReadonlyPromiseRule extends StObject {
  
  def `catch`[TResult](): js.Promise[Rule | TResult]
  
  def `finally`(): js.Promise[Rule]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseRule {
  
  inline def apply(
    `catch`: () => js.Promise[Rule | Any],
    `finally`: () => js.Promise[Rule],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseRule] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[Rule | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[Rule]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
