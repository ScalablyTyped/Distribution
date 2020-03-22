package typings.algoliaClientAnalytics

import typings.algoliaClientAnalytics.mod.DeleteABTestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>> */
trait ReadonlyPromiseDeleteABTe extends js.Object {
  def `catch`[TResult](): js.Promise[DeleteABTestResponse | TResult]
  def `finally`(): js.Promise[DeleteABTestResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseDeleteABTe {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[DeleteABTestResponse | js.Any],
    `finally`: () => js.Promise[DeleteABTestResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseDeleteABTe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseDeleteABTe]
  }
}

