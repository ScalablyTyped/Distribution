package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Rule>> */
@js.native
trait ReadonlyPromiseRule extends StObject {
  
  def `catch`[TResult](): js.Promise[Rule | TResult] = js.native
  
  def `finally`(): js.Promise[Rule] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseRule {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Rule | js.Any],
    `finally`: () => js.Promise[Rule],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRule]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseRuleMutableBuilder[Self <: ReadonlyPromiseRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[Rule | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[Rule]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
