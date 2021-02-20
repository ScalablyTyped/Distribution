package typings.algoliasearch.anon

import typings.algoliaClientAnalytics.mod.DeleteABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>> */
@js.native
trait ReadonlyPromiseDeleteABTe extends StObject {
  
  def `catch`[TResult](): js.Promise[DeleteABTestResponse | TResult] = js.native
  
  def `finally`(): js.Promise[DeleteABTestResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseDeleteABTe {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[DeleteABTestResponse | js.Any],
    `finally`: () => js.Promise[DeleteABTestResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseDeleteABTe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseDeleteABTe]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseDeleteABTeMutableBuilder[Self <: ReadonlyPromiseDeleteABTe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[DeleteABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[DeleteABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
