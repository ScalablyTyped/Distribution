package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchUserIDsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchUserIDsResponse>> */
trait ReadonlyPromiseSearchUser extends js.Object {
  def `catch`[TResult](): js.Promise[SearchUserIDsResponse | TResult]
  def `finally`(): js.Promise[SearchUserIDsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseSearchUser {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SearchUserIDsResponse | js.Any],
    `finally`: () => js.Promise[SearchUserIDsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseSearchUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseSearchUser]
  }
}

