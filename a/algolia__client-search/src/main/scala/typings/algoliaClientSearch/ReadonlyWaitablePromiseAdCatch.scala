package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.AddApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.AddApiKeyResponse>> */
trait ReadonlyWaitablePromiseAdCatch extends js.Object {
  def `catch`[TResult](): js.Promise[AddApiKeyResponse | TResult]
  def `finally`(): js.Promise[AddApiKeyResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseAdCatch {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[AddApiKeyResponse | js.Any],
    `finally`: () => js.Promise[AddApiKeyResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseAdCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseAdCatch]
  }
}

