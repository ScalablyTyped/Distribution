package typings.algoliasearch.anon

import typings.algoliaClientAnalytics.mod.StopABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.StopABTestResponse>> */
trait ReadonlyPromiseStopABTest extends StObject {
  
  def `catch`[TResult](): js.Promise[StopABTestResponse | TResult]
  
  def `finally`(): js.Promise[StopABTestResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseStopABTest {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[StopABTestResponse | js.Any],
    `finally`: () => js.Promise[StopABTestResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseStopABTest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseStopABTest]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseStopABTestMutableBuilder[Self <: ReadonlyPromiseStopABTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[StopABTestResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[StopABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
