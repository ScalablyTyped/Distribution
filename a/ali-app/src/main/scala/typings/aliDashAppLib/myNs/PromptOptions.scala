package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptOptions
  extends BaseOptions[js.Any, js.Any] {
  /** message对齐方式，可用枚举left/center/right，iOS ‘center’, android ‘left’ */
  var align: js.UndefOr[
    aliDashAppLib.aliDashAppLibStrings.left | aliDashAppLib.aliDashAppLibStrings.center | aliDashAppLib.aliDashAppLibStrings.right | java.lang.String
  ] = js.undefined
  /** 确认按钮文字，默认‘取消’ */
  var cancelButtonText: java.lang.String
  /** prompt框文本，默认‘请输入内容’ */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /** 确认按钮文字，默认‘确定’ */
  var okButtonText: java.lang.String
  /** 输入框内的提示文案 */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** prompt框标题 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  @JSName("success")
  def success_MPromptOptions(result: aliDashAppLib.Anon_InputValue): scala.Unit
}

object PromptOptions {
  @scala.inline
  def apply(
    cancelButtonText: java.lang.String,
    okButtonText: java.lang.String,
    success: js.Function1[aliDashAppLib.Anon_InputValue, scala.Unit],
    align: aliDashAppLib.aliDashAppLibStrings.left | aliDashAppLib.aliDashAppLibStrings.center | aliDashAppLib.aliDashAppLibStrings.right | java.lang.String = null,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    message: java.lang.String = null,
    placeholder: java.lang.String = null,
    title: java.lang.String = null
  ): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelButtonText")(cancelButtonText)
    __obj.updateDynamic("okButtonText")(okButtonText)
    __obj.updateDynamic("success")(success)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (message != null) __obj.updateDynamic("message")(message)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PromptOptions]
  }
}

