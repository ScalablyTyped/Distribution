package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.RemoveUserIDResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>> */
trait ReadonlyPromiseRemoveUser extends js.Object {
  def `catch`[TResult](): js.Promise[RemoveUserIDResponse | TResult]
  def `finally`(): js.Promise[RemoveUserIDResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseRemoveUser {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[RemoveUserIDResponse | js.Any],
    `finally`: () => js.Promise[RemoveUserIDResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseRemoveUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseRemoveUser]
  }
}

