package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.AssignUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDsResponse>> */
@js.native
trait ReadonlyPromiseAssignUserCatch extends StObject {
  
  def `catch`[TResult](): js.Promise[AssignUserIDsResponse | TResult] = js.native
  
  def `finally`(): js.Promise[AssignUserIDsResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}
object ReadonlyPromiseAssignUserCatch {
  
  @scala.inline
  def apply(
    `catch`: () => js.Promise[AssignUserIDsResponse | js.Any],
    `finally`: () => js.Promise[AssignUserIDsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseAssignUserCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseAssignUserCatch]
  }
  
  @scala.inline
  implicit class ReadonlyPromiseAssignUserCatchMutableBuilder[Self <: ReadonlyPromiseAssignUserCatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatch(value: () => js.Promise[AssignUserIDsResponse | js.Any]): Self = StObject.set(x, "catch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinally(value: () => js.Promise[AssignUserIDsResponse]): Self = StObject.set(x, "finally", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = StObject.set(x, "then", js.Any.fromFunction0(value))
  }
}
