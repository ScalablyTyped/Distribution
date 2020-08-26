package typings.aliApp.my

import typings.aliApp.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 剪贴板 https://docs.alipay.com/mini/api/clipboard
@js.native
trait GetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetClipboardOptions: js.UndefOr[js.Function1[/* res */ Text, Unit]] = js.native
}

object GetClipboardOptions {
  @scala.inline
  def apply(): GetClipboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClipboardOptions]
  }
  @scala.inline
  implicit class GetClipboardOptionsOps[Self <: GetClipboardOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ Text => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

