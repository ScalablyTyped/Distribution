package typings.aliApp.my

import typings.aliApp.AnonConfirm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: String
  /** 确认按钮文字，默认‘确定’ */
  var confirmButtonText: String
  /** confirm框的内容 */
  var content: String
  /** confirm框的标题 */
  var title: String
  @JSName("success")
  def success_MConfirmOptions(result: AnonConfirm): Unit
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancelButtonText: String,
    confirmButtonText: String,
    content: String,
    success: AnonConfirm => Unit,
    title: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], confirmButtonText = confirmButtonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ConfirmOptions]
  }
}

