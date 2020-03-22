package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.SaveRuleResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRuleResponse>> */
trait ReadonlyWaitablePromiseSa0 extends js.Object {
  def `catch`[TResult](): js.Promise[SaveRuleResponse | TResult]
  def `finally`(): js.Promise[SaveRuleResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseSa0 {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveRuleResponse | js.Any],
    `finally`: () => js.Promise[SaveRuleResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseSa0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSa0]
  }
}

