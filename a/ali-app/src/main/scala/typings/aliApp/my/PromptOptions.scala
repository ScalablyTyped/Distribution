package typings.aliApp.my

import typings.aliApp.aliAppStrings.center
import typings.aliApp.aliAppStrings.left
import typings.aliApp.aliAppStrings.right
import typings.aliApp.anon.InputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptOptions
  extends BaseOptions[js.Any, js.Any] {
  /** message对齐方式，可用枚举left/center/right，iOS ‘center’, android ‘left’ */
  var align: js.UndefOr[left | center | right | String] = js.native
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String = js.native
  /** prompt框文本，默认‘请输入内容’ */
  var message: js.UndefOr[String] = js.native
  /** 确认按钮文字，默认‘确定’ */
  var okButtonText: String = js.native
  /** 输入框内的提示文案 */
  var placeholder: js.UndefOr[String] = js.native
  /** prompt框标题 */
  var title: js.UndefOr[String] = js.native
  @JSName("success")
  def success_MPromptOptions(result: InputValue): Unit = js.native
}

object PromptOptions {
  @scala.inline
  def apply(cancelButtonText: String, okButtonText: String, success: InputValue => Unit): PromptOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[PromptOptions]
  }
  @scala.inline
  implicit class PromptOptionsOps[Self <: PromptOptions] (val x: Self) extends AnyVal {
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
    def setOkButtonText(value: String): Self = this.set("okButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: InputValue => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setAlign(value: left | center | right | String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

