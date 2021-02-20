package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.GetTopUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetTopUserIDsResponse>> */
@js.native
trait ReadonlyPromiseGetTopUser extends StObject {
  
  def `catch`[TResult](): js.Promise[GetTopUserIDsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[GetTopUserIDsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseGetTopUser {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetTopUserIDsResponse | js.Any],
    `finally`: () => js.Promise[GetTopUserIDsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetTopUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetTopUser]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseGetTopUserMutableBuilder[Self <: ReadonlyPromiseGetTopUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[GetTopUserIDsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[GetTopUserIDsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
