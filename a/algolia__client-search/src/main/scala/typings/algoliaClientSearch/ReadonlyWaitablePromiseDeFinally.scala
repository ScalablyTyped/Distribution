package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.DeleteResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteResponse>> */
trait ReadonlyWaitablePromiseDeFinally extends js.Object {
  def `catch`[TResult](): js.Promise[DeleteResponse | TResult]
  def `finally`(): js.Promise[DeleteResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseDeFinally {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[DeleteResponse | js.Any],
    `finally`: () => js.Promise[DeleteResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseDeFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseDeFinally]
  }
}

