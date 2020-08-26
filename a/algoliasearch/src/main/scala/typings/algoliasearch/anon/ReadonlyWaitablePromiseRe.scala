package typings.algoliasearch.anon

import typings.algoliaClientSearch.mod.RestoreApiKeyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.RestoreApiKeyResponse>> */
@js.native
trait ReadonlyWaitablePromiseRe extends js.Object {
  def `catch`[TResult](): js.Promise[RestoreApiKeyResponse | TResult] = js.native
  def `finally`(): js.Promise[RestoreApiKeyResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
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
  @scala.inline
  implicit class ReadonlyWaitablePromiseReOps[Self <: ReadonlyWaitablePromiseRe] (val x: Self) extends AnyVal {
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
    def setCatch(value: () => js.Promise[RestoreApiKeyResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[RestoreApiKeyResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

