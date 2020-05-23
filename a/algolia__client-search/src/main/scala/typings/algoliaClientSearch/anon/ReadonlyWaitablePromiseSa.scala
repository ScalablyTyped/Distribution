package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SaveRulesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>> */
trait ReadonlyWaitablePromiseSa extends js.Object {
  def `catch`[TResult](): js.Promise[SaveRulesResponse | TResult]
  def `finally`(): js.Promise[SaveRulesResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseSa {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveRulesResponse | js.Any],
    `finally`: () => js.Promise[SaveRulesResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseSa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSa]
  }
}

