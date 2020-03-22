package typings.algoliaClientAnalytics

import typings.algoliaClientAnalytics.mod.GetABTestsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestsResponse>> */
trait ReadonlyPromiseGetABTests extends js.Object {
  def `catch`[TResult](): js.Promise[GetABTestsResponse | TResult]
  def `finally`(): js.Promise[GetABTestsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseGetABTests {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[GetABTestsResponse | js.Any],
    `finally`: () => js.Promise[GetABTestsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseGetABTests = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseGetABTests]
  }
}

