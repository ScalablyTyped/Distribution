package typings.algoliaClientAnalytics.anon

import typings.algoliaClientAnalytics.mod.DeleteABTestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>> */
@js.native
trait ReadonlyPromiseDeleteABTe extends js.Object {
  def `catch`[TResult](): js.Promise[DeleteABTestResponse | TResult] = js.native
  def `finally`(): js.Promise[DeleteABTestResponse] = js.native
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
}

object ReadonlyPromiseDeleteABTe {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[DeleteABTestResponse | js.Any],
    `finally`: () => js.Promise[DeleteABTestResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseDeleteABTe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseDeleteABTe]
  }
  @scala.inline
  implicit class ReadonlyPromiseDeleteABTeOps[Self <: ReadonlyPromiseDeleteABTe] (val x: Self) extends AnyVal {
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
    def setCatch(value: () => js.Promise[DeleteABTestResponse | js.Any]): Self = this.set("catch", js.Any.fromFunction0(value))
    @scala.inline
    def setFinally(value: () => js.Promise[DeleteABTestResponse]): Self = this.set("finally", js.Any.fromFunction0(value))
    @scala.inline
    def setThen(value: () => js.Promise[js.Any | js.Any]): Self = this.set("then", js.Any.fromFunction0(value))
  }
  
}

