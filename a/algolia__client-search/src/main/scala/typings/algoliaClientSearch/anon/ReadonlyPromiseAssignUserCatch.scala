package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.AssignUserIDsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDsResponse>> */
trait ReadonlyPromiseAssignUserCatch extends js.Object {
  def `catch`[TResult](): js.Promise[AssignUserIDsResponse | TResult]
  def `finally`(): js.Promise[AssignUserIDsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
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
}

