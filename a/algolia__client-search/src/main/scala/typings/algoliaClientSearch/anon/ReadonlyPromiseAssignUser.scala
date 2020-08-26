package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.AssignUserIDResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDResponse>> */
@js.native
trait ReadonlyPromiseAssignUser extends js.Object {
  def `catch`[TResult](): js.Promise[AssignUserIDResponse | TResult] = js.native
  def `finally`(): js.Promise[AssignUserIDResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}

object ReadonlyPromiseAssignUser {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[AssignUserIDResponse | js.Any],
    `finally`: () => js.Promise[AssignUserIDResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseAssignUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseAssignUser]
  }
  @scala.inline
  implicit class ReadonlyPromiseAssignUserOps[Self <: ReadonlyPromiseAssignUser] (val x: Self) extends AnyVal {
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
    def setCatch(value: () => js.Promise[AssignUserIDResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[AssignUserIDResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

