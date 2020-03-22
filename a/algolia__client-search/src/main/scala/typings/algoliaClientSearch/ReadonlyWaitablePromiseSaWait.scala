package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.SaveSynonymsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>> */
trait ReadonlyWaitablePromiseSaWait extends js.Object {
  def `catch`[TResult](): js.Promise[SaveSynonymsResponse | TResult]
  def `finally`(): js.Promise[SaveSynonymsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseSaWait {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[SaveSynonymsResponse | js.Any],
    `finally`: () => js.Promise[SaveSynonymsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseSaWait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaWait]
  }
}

