package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.UserIDResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.UserIDResponse>> */
trait ReadonlyPromiseUserIDResp extends StObject {
  
  def `catch`[TResult](): js.Promise[UserIDResponse | TResult]
  
  def `finally`(): js.Promise[UserIDResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseUserIDResp {
  
  inline def apply(
    `catch`: () => js.Promise[UserIDResponse | Any],
    `finally`: () => js.Promise[UserIDResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseUserIDResp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseUserIDResp]
  }
  
  extension [Self <: ReadonlyPromiseUserIDResp](x: Self) {
    
    inline def setCatch(value: () => js.Promise[UserIDResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[UserIDResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
