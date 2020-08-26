package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DismissText extends js.Object {
  var DatePickerLocale: Day = js.native
  /** 取消 */
  var dismissText: String = js.native
  /** 请选择 */
  var extra: String = js.native
  /** 确定 */
  var okText: String = js.native
}

object DismissText {
  @scala.inline
  def apply(DatePickerLocale: Day, dismissText: String, extra: String, okText: String): DismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissText]
  }
  @scala.inline
  implicit class DismissTextOps[Self <: DismissText] (val x: Self) extends AnyVal {
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
    def setDatePickerLocale(value: Day): Self = this.set("DatePickerLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def setDismissText(value: String): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
  }
  
}

