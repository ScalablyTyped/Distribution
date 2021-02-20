package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.GetApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetApiKeyResponse>> */
@js.native
trait ReadonlyPromiseGetApiKeyR extends StObject {
  
  def `catch`[TResult](): js.Promise[GetApiKeyResponse | TResult] = js.native
  
  def `finally`(): js.Promise[GetApiKeyResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseGetApiKeyR {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetApiKeyResponse | js.Any],
    `finally`: () => js.Promise[GetApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetApiKeyR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetApiKeyR]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseGetApiKeyRMutableBuilder[Self <: ReadonlyPromiseGetApiKeyR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[GetApiKeyResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[GetApiKeyResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
