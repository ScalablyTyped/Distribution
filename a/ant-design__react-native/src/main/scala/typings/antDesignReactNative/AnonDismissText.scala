package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDismissText extends js.Object {
  var DatePickerLocale: AnonDay
  /** 取消 */
  var dismissText: String
  /** 请选择 */
  var extra: String
  /** 确定 */
  var okText: String
}

object AnonDismissText {
  @scala.inline
  def apply(DatePickerLocale: AnonDay, dismissText: String, extra: String, okText: String): AnonDismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDismissText]
  }
}

