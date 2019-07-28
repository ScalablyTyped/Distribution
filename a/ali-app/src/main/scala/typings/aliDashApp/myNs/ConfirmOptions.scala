package typings.aliDashApp.myNs

import typings.aliDashApp.Anon_Confirm
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
  def success_MConfirmOptions(result: Anon_Confirm): Unit
}

object ConfirmOptions {
  @scala.inline
  def apply(
    cancelButtonText: String,
    confirmButtonText: String,
    content: String,
    success: Anon_Confirm => Unit,
    title: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): ConfirmOptions = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText, confirmButtonText = confirmButtonText, content = content, success = js.Any.fromFunction1(success), title = title)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ConfirmOptions]
  }
}

