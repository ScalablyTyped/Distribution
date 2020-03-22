package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.AssignUserIDResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDResponse>> */
trait ReadonlyPromiseAssignUser extends js.Object {
  def `catch`[TResult](): js.Promise[AssignUserIDResponse | TResult]
  def `finally`(): js.Promise[AssignUserIDResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseAssignUser {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[AssignUserIDResponse | js.Any],
    `finally`: () => js.Promise[AssignUserIDResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseAssignUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseAssignUser]
  }
}

