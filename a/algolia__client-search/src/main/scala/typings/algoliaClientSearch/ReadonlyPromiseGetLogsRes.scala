package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.GetLogsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetLogsResponse>> */
trait ReadonlyPromiseGetLogsRes extends js.Object {
  def `catch`[TResult](): js.Promise[GetLogsResponse | TResult]
  def `finally`(): js.Promise[GetLogsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseGetLogsRes {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetLogsResponse | js.Any],
    `finally`: () => js.Promise[GetLogsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetLogsRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetLogsRes]
  }
}

