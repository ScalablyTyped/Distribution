package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.PartialUpdateObjectResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.PartialUpdateObjectResponse>> */
trait ReadonlyWaitablePromisePa extends StObject {
  
  def `catch`[TResult](): js.Promise[PartialUpdateObjectResponse | TResult]
  
  def `finally`(): js.Promise[PartialUpdateObjectResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromisePa {
  
  inline def apply(
    `catch`: () => js.Promise[PartialUpdateObjectResponse | Any],
    `finally`: () => js.Promise[PartialUpdateObjectResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyWaitablePromisePa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromisePa]
  }
  
  extension [Self <: ReadonlyWaitablePromisePa](x: Self) {
    
    inline def setCatch(value: () => js.Promise[PartialUpdateObjectResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[PartialUpdateObjectResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
