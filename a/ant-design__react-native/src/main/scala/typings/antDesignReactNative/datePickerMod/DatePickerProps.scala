package typings.antDesignReactNative.datePickerMod

import typings.antDesignReactNative.datePickerPropsTypeMod.DatePickerPropsType
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.pickerStyleMod.PickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProps
  extends DatePickerPropsType
     with WithThemeStyles[PickerStyle] {
  var triggerTypes: js.UndefOr[String] = js.native
}

object DatePickerProps {
  @scala.inline
  def apply(): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerProps]
  }
  @scala.inline
  implicit class DatePickerPropsOps[Self <: DatePickerProps] (val x: Self) extends AnyVal {
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
    def setTriggerTypes(value: String): Self = this.set("triggerTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggerTypes: Self = this.set("triggerTypes", js.undefined)
  }
  
}

