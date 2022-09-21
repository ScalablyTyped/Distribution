package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchUserIDsResponse>> */
trait ReadonlyPromiseSearchUser extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchUserIDsResponse | TResult]
  
  def `finally`(): js.Promise[SearchUserIDsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchUser {
  
  inline def apply(
    `catch`: () => js.Promise[SearchUserIDsResponse | Any],
    `finally`: () => js.Promise[SearchUserIDsResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseSearchUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchUser]
  }
  
  extension [Self <: ReadonlyPromiseSearchUser](x: Self) {
    
    inline def setCatch(value: () => js.Promise[SearchUserIDsResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[SearchUserIDsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
