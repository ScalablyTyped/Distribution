package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 交互反馈 https://docs.alipay.com/mini/api/ui-feedback
trait AlertOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 按钮文字，默认确定 */
  var buttonText: java.lang.String
  /** alert框的内容 */
  var content: java.lang.String
  /** alert框的标题 */
  var title: java.lang.String
}

object AlertOptions {
  @scala.inline
  def apply(
    buttonText: java.lang.String,
    content: java.lang.String,
    title: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): AlertOptions = {
    val __obj = js.Dynamic.literal(buttonText = buttonText, content = content, title = title)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AlertOptions]
  }
}

