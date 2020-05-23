package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.GetTopUserIDsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetTopUserIDsResponse>> */
trait ReadonlyPromiseGetTopUser extends js.Object {
  def `catch`[TResult](): js.Promise[GetTopUserIDsResponse | TResult]
  def `finally`(): js.Promise[GetTopUserIDsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
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
}

