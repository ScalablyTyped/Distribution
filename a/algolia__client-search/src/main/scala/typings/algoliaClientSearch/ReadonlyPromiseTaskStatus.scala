package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.TaskStatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.TaskStatusResponse>> */
trait ReadonlyPromiseTaskStatus extends js.Object {
  def `catch`[TResult](): js.Promise[TaskStatusResponse | TResult]
  def `finally`(): js.Promise[TaskStatusResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
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
}

