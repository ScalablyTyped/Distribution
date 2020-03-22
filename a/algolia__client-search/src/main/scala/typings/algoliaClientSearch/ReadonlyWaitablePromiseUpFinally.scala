package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.UpdateApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.UpdateApiKeyResponse>> */
trait ReadonlyWaitablePromiseUpFinally extends js.Object {
  def `catch`[TResult](): js.Promise[UpdateApiKeyResponse | TResult]
  def `finally`(): js.Promise[UpdateApiKeyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseUpFinally {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[UpdateApiKeyResponse | js.Any],
    `finally`: () => js.Promise[UpdateApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseUpFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseUpFinally]
  }
}

