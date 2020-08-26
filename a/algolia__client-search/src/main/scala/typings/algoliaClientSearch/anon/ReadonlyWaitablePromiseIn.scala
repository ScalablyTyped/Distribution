package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.IndexOperationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.IndexOperationResponse>> */
@js.native
trait ReadonlyWaitablePromiseIn extends js.Object {
  def `catch`[TResult](): js.Promise[IndexOperationResponse | TResult] = js.native
  def `finally`(): js.Promise[IndexOperationResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
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
  @scala.inline
  implicit class ReadonlyWaitablePromiseInOps[Self <: ReadonlyWaitablePromiseIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCatch(value: () => js.Promise[IndexOperationResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[IndexOperationResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

