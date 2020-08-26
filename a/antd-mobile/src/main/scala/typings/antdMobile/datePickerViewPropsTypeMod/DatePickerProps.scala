package typings.antdMobile.datePickerViewPropsTypeMod

import typings.antdMobile.datePickerPropsTypeMod.DatePickerPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerProps extends DatePickerPropsType {
  var className: js.UndefOr[String] = js.native
  var onScrollChange: js.UndefOr[js.Function3[/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.native
  var pickerPrefixCls: js.UndefOr[String] = js.native
  var prefixCls: js.UndefOr[String] = js.native
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setOnScrollChange(value: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onScrollChange", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnScrollChange: Self = this.set("onScrollChange", js.undefined)
    @scala.inline
    def setPickerPrefixCls(value: String): Self = this.set("pickerPrefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePickerPrefixCls: Self = this.set("pickerPrefixCls", js.undefined)
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
  
}

