package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DismissText extends js.Object {
  var DatePickerLocale: Day
  /** 取消 */
  var dismissText: String
  /** 请选择 */
  var extra: String
  /** 确定 */
  var okText: String
}

object DismissText {
  @scala.inline
  def apply(DatePickerLocale: Day, dismissText: String, extra: String, okText: String): DismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissText]
  }
}

