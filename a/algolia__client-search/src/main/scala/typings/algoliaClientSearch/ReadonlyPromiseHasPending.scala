package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.HasPendingMappingsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>> */
trait ReadonlyPromiseHasPending extends js.Object {
  def `catch`[TResult](): js.Promise[HasPendingMappingsResponse | TResult]
  def `finally`(): js.Promise[HasPendingMappingsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseHasPending {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[HasPendingMappingsResponse | js.Any],
    `finally`: () => js.Promise[HasPendingMappingsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseHasPending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseHasPending]
  }
}

