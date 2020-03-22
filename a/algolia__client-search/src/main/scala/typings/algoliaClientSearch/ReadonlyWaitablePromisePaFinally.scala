package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.PartialUpdateObjectResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.PartialUpdateObjectResponse>> */
trait ReadonlyWaitablePromisePaFinally extends js.Object {
  def `catch`[TResult](): js.Promise[PartialUpdateObjectResponse | TResult]
  def `finally`(): js.Promise[PartialUpdateObjectResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromisePaFinally {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[PartialUpdateObjectResponse | js.Any],
    `finally`: () => js.Promise[PartialUpdateObjectResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromisePaFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromisePaFinally]
  }
}

