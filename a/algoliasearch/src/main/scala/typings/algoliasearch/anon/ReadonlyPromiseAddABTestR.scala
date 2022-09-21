package typings.algoliasearch.anon

import typings.algoliaClientAnalytics.mod.AddABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>> */
trait ReadonlyPromiseAddABTestR extends StObject {
  
  def `catch`[TResult](): js.Promise[AddABTestResponse | TResult]
  
  def `finally`(): js.Promise[AddABTestResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseAddABTestR {
  
  inline def apply(
    `catch`: () => js.Promise[AddABTestResponse | Any],
    `finally`: () => js.Promise[AddABTestResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseAddABTestR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseAddABTestR]
  }
  
  extension [Self <: ReadonlyPromiseAddABTestR](x: Self) {
    
    inline def setCatch(value: () => js.Promise[AddABTestResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[AddABTestResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
