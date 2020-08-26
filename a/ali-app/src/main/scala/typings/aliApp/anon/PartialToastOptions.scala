package typings.aliApp.anon

import typings.aliApp.aliAppStrings.exception
import typings.aliApp.aliAppStrings.fail
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ToastOptions> */
@js.native
trait PartialToastOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var content: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var `type`: js.UndefOr[none | success | fail | exception | String] = js.native
}

object PartialToastOptions {
  @scala.inline
  def apply(): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastOptions]
  }
  @scala.inline
  implicit class PartialToastOptionsOps[Self <: PartialToastOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: none | success | fail | exception | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

