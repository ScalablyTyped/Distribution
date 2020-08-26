package typings.aliApp.my

import typings.aliApp.anon.Confirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String = js.native
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: String = js.native
  /** confirm框的内容 */
  var content: String = js.native
  /** confirm框的标题 */
  var title: String = js.native
  @JSName("success")
  def success_MConfirmOptions(result: Confirm): Unit = js.native
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancelButtonText: String,
    confirmButtonText: String,
    content: String,
    success: Confirm => Unit,
    title: String
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], confirmButtonText = confirmButtonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmOptions]
  }
  @scala.inline
  implicit class ConfirmOptionsOps[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
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
    def setConfirmButtonText(value: String): Self = this.set("confirmButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Confirm => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

