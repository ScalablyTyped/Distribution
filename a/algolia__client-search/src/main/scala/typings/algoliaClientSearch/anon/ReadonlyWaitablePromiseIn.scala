package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.IndexOperationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>> */
trait ReadonlyWaitablePromiseIn extends js.Object {
  def `catch`[TResult](): js.Promise[IndexOperationResponse | TResult]
  def `finally`(): js.Promise[IndexOperationResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseIn {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[IndexOperationResponse | js.Any],
    `finally`: () => js.Promise[IndexOperationResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseIn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseIn]
  }
}

