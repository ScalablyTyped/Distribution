package typings.algoliasearch.anon

import typings.algoliaClientAnalytics.mod.GetABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestResponse>> */
trait ReadonlyPromiseGetABTestR extends StObject {
  
  def `catch`[TResult](): js.Promise[GetABTestResponse | TResult]
  
  def `finally`(): js.Promise[GetABTestResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetABTestR {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetABTestResponse | js.Any],
    `finally`: () => js.Promise[GetABTestResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetABTestR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetABTestR]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseGetABTestRMutableBuilder[Self <: ReadonlyPromiseGetABTestR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[GetABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[GetABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
