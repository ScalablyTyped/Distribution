package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.HasPendingMappingsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>> */
@js.native
trait ReadonlyPromiseHasPending extends StObject {
  
  def `catch`[TResult](): js.Promise[HasPendingMappingsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[HasPendingMappingsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseHasPending {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[HasPendingMappingsResponse | js.Any],
    `finally`: () => js.Promise[HasPendingMappingsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseHasPending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseHasPending]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseHasPendingMutableBuilder[Self <: ReadonlyPromiseHasPending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[HasPendingMappingsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[HasPendingMappingsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
