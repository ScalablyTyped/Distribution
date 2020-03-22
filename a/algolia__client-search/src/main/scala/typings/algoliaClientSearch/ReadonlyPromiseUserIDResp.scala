package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.UserIDResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.UserIDResponse>> */
trait ReadonlyPromiseUserIDResp extends js.Object {
  def `catch`[TResult](): js.Promise[UserIDResponse | TResult]
  def `finally`(): js.Promise[UserIDResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseUserIDResp {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[UserIDResponse | js.Any],
    `finally`: () => js.Promise[UserIDResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseUserIDResp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseUserIDResp]
  }
}

