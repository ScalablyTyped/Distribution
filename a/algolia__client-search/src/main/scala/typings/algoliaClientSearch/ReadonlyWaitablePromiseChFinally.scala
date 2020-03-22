package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.ChunkedBatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>> */
trait ReadonlyWaitablePromiseChFinally extends js.Object {
  def `catch`[TResult](): js.Promise[ChunkedBatchResponse | TResult]
  def `finally`(): js.Promise[ChunkedBatchResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseChFinally {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ChunkedBatchResponse | js.Any],
    `finally`: () => js.Promise[ChunkedBatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseChFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseChFinally]
  }
}

