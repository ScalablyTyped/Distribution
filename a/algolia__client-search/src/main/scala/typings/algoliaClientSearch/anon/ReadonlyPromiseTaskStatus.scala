package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.TaskStatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.TaskStatusResponse>> */
@js.native
trait ReadonlyPromiseTaskStatus extends js.Object {
  def `catch`[TResult](): js.Promise[TaskStatusResponse | TResult] = js.native
  def `finally`(): js.Promise[TaskStatusResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}

object ReadonlyPromiseTaskStatus {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[TaskStatusResponse | js.Any],
    `finally`: () => js.Promise[TaskStatusResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseTaskStatus]
  }
  @scala.inline
  implicit class ReadonlyPromiseTaskStatusOps[Self <: ReadonlyPromiseTaskStatus] (val x: Self) extends AnyVal {
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
    def setCatch(value: () => js.Promise[TaskStatusResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[TaskStatusResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

