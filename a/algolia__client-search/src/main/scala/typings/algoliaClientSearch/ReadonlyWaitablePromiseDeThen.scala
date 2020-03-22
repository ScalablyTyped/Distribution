package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.DeleteApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteApiKeyResponse>> */
trait ReadonlyWaitablePromiseDeThen extends js.Object {
  def `catch`[TResult](): js.Promise[DeleteApiKeyResponse | TResult]
  def `finally`(): js.Promise[DeleteApiKeyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseDeThen {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[DeleteApiKeyResponse | js.Any],
    `finally`: () => js.Promise[DeleteApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseDeThen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseDeThen]
  }
}

