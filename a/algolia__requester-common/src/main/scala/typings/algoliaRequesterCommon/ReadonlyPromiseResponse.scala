package typings.algoliaRequesterCommon

import typings.algoliaRequesterCommon.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/requester-common.@algolia/requester-common.Response>> */
trait ReadonlyPromiseResponse extends js.Object {
  def `catch`[TResult](): js.Promise[Response | TResult]
  def `finally`(): js.Promise[Response]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseResponse {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Response | js.Any],
    `finally`: () => js.Promise[Response],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseResponse]
  }
}

