package typings.antdMobile.datePickerPropsTypeMod

import typings.antdMobile.anon.DatePickerLocale
import typings.antdMobile.antdMobileStrings.date
import typings.antdMobile.antdMobileStrings.datetime
import typings.antdMobile.antdMobileStrings.month
import typings.antdMobile.antdMobileStrings.time
import typings.antdMobile.antdMobileStrings.year
import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatePickerPropsType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.native
  var dismissText: js.UndefOr[ReactNode] = js.native
  var extra: js.UndefOr[String] = js.native
  var format: js.UndefOr[String | (js.Function1[/* value */ Date, String])] = js.native
  var locale: js.UndefOr[DatePickerLocale] = js.native
  var maxDate: js.UndefOr[Date] = js.native
  var minDate: js.UndefOr[Date] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[datetime | date | year | month | time] = js.native
  var okText: js.UndefOr[ReactNode] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Date, Unit]] = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.native
  var title: js.UndefOr[ReactNode] = js.native
  var value: js.UndefOr[Date] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object DatePickerPropsType {
  @scala.inline
  def apply(): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerPropsType]
  }
  @scala.inline
  implicit class DatePickerPropsTypeOps[Self <: DatePickerPropsType] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDismissText(value: ReactNode): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDismissText: Self = this.set("dismissText", js.undefined)
    @scala.inline
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* value */ Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: String | (js.Function1[/* value */ Date, String])): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setLocale(value: DatePickerLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setMode(value: datetime | date | year | month | time): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOkText(value: ReactNode): Self = this.set("okText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOkText: Self = this.set("okText", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Date => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDismiss(value: () => Unit): Self = this.set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    @scala.inline
    def setOnValueChange(value: (/* vals */ js.Any, /* index */ Double) => Unit): Self = this.set("onValueChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

