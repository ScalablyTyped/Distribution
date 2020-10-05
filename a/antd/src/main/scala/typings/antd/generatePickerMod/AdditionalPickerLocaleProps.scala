package typings.antd.generatePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalPickerLocaleProps extends js.Object {
  var dateFormat: js.UndefOr[String] = js.native
  var dateTimeFormat: js.UndefOr[String] = js.native
  var monthFormat: js.UndefOr[String] = js.native
  var weekFormat: js.UndefOr[String] = js.native
}

object AdditionalPickerLocaleProps {
  @scala.inline
  def apply(): AdditionalPickerLocaleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalPickerLocaleProps]
  }
  @scala.inline
  implicit class AdditionalPickerLocalePropsOps[Self <: AdditionalPickerLocaleProps] (val x: Self) extends AnyVal {
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDateTimeFormat(value: String): Self = this.set("dateTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeFormat: Self = this.set("dateTimeFormat", js.undefined)
    @scala.inline
    def setMonthFormat(value: String): Self = this.set("monthFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthFormat: Self = this.set("monthFormat", js.undefined)
    @scala.inline
    def setWeekFormat(value: String): Self = this.set("weekFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekFormat: Self = this.set("weekFormat", js.undefined)
  }
  
}

