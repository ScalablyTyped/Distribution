package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.RemoveUserIDResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>> */
trait ReadonlyPromiseRemoveUser extends StObject {
  
  def `catch`[TResult](): js.Promise[RemoveUserIDResponse | TResult]
  
  def `finally`(): js.Promise[RemoveUserIDResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseRemoveUser {
  
  inline def apply(
    `catch`: () => js.Promise[RemoveUserIDResponse | Any],
    `finally`: () => js.Promise[RemoveUserIDResponse],
    `then`: () => js.Promise[Any | Any]
  ): ReadonlyPromiseRemoveUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRemoveUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPromiseRemoveUser] (val x: Self) extends AnyVal {
    
    inline def setCatch(value: () => js.Promise[RemoveUserIDResponse | Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    inline def setFinally(value: () => js.Promise[RemoveUserIDResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    inline def setThen(value: () => js.Promise[Any | Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
