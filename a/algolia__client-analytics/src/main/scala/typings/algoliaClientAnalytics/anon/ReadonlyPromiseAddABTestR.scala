package typings.algoliaClientAnalytics.anon

import typings.algoliaClientAnalytics.mod.AddABTestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>> */
trait ReadonlyPromiseAddABTestR extends js.Object {
  def `catch`[TResult](): js.Promise[AddABTestResponse | TResult]
  def `finally`(): js.Promise[AddABTestResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseAddABTestR {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[AddABTestResponse | js.Any],
    `finally`: () => js.Promise[AddABTestResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseAddABTestR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseAddABTestR]
  }
}

