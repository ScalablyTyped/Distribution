package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatePickerLocaleDismissText extends js.Object {
  var DatePickerLocale: AnonAmDay
  /** 取消 */
  var dismissText: String
  /** 请选择 */
  var extra: String
  /** 确定 */
  var okText: String
}

object AnonDatePickerLocaleDismissText {
  @scala.inline
  def apply(DatePickerLocale: AnonAmDay, dismissText: String, extra: String, okText: String): AnonDatePickerLocaleDismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDatePickerLocaleDismissText]
  }
}

