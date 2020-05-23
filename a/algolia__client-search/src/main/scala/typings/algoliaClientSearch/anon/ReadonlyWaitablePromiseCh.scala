package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ChunkedBatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>> */
trait ReadonlyWaitablePromiseCh extends js.Object {
  def `catch`[TResult](): js.Promise[ChunkedBatchResponse | TResult]
  def `finally`(): js.Promise[ChunkedBatchResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseCh {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ChunkedBatchResponse | js.Any],
    `finally`: () => js.Promise[ChunkedBatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseCh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseCh]
  }
}

