package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.RestoreApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.RestoreApiKeyResponse>> */
trait ReadonlyWaitablePromiseRe extends js.Object {
  def `catch`[TResult](): js.Promise[RestoreApiKeyResponse | TResult]
  def `finally`(): js.Promise[RestoreApiKeyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseRe {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[RestoreApiKeyResponse | js.Any],
    `finally`: () => js.Promise[RestoreApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseRe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseRe]
  }
}

