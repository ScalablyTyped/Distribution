package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.BatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.BatchResponse>> */
trait ReadonlyWaitablePromiseBa extends js.Object {
  def `catch`[TResult](): js.Promise[BatchResponse | TResult]
  def `finally`(): js.Promise[BatchResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseBa {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[BatchResponse | js.Any],
    `finally`: () => js.Promise[BatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseBa = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseBa]
  }
}

