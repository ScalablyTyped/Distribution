package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ConfirmOptions> */
@js.native
trait PartialConfirmOptions extends js.Object {
  var cancelButtonText: js.UndefOr[String] = js.native
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var confirmButtonText: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var success: js.UndefOr[js.Function1[/* result */ Confirm, Unit]] = js.native
  var title: js.UndefOr[String] = js.native
}

object PartialConfirmOptions {
  @scala.inline
  def apply(): PartialConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfirmOptions]
  }
  @scala.inline
  implicit class PartialConfirmOptionsOps[Self <: PartialConfirmOptions] (val x: Self) extends AnyVal {
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
    def setCancelButtonText(value: String): Self = this.set("cancelButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonText: Self = this.set("cancelButtonText", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setConfirmButtonText(value: String): Self = this.set("confirmButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmButtonText: Self = this.set("confirmButtonText", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ Confirm => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

