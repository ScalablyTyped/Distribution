package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 交互反馈 https://docs.alipay.com/mini/api/ui-feedback
trait AlertOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 按钮文字，默认确定 */
  var buttonText: String
  /** alert框的内容 */
  var content: String
  /** alert框的标题 */
  var title: String
}

object AlertOptions {
  @scala.inline
  def apply(
    buttonText: String,
    content: String,
    title: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): AlertOptions = {
    val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[AlertOptions]
  }
}

