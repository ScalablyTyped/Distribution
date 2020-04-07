package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.SaveObjectResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveObjectResponse>> */
trait ReadonlyWaitablePromiseSaFinally extends js.Object {
  def `catch`[TResult](): js.Promise[SaveObjectResponse | TResult]
  def `finally`(): js.Promise[SaveObjectResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseSaFinally {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveObjectResponse | js.Any],
    `finally`: () => js.Promise[SaveObjectResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseSaFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaFinally]
  }
}

