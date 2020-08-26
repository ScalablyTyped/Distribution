package typings.atlassianConnectJs.anon

import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<atlassian-connect-js.AP.jira.DatePickerOptions> */
@js.native
trait PartialDatePickerOptions extends js.Object {
  var date: js.UndefOr[String] = js.native
  var element: js.UndefOr[HTMLElement] = js.native
  var onSelect: js.UndefOr[js.Function2[/* isoDate */ String, /* date */ Date, Unit]] = js.native
  var position: js.UndefOr[Left] = js.native
  var showTime: js.UndefOr[Boolean] = js.native
}

object PartialDatePickerOptions {
  @scala.inline
  def apply(): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
  @scala.inline
  implicit class PartialDatePickerOptionsOps[Self <: PartialDatePickerOptions] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setOnSelect(value: (/* isoDate */ String, /* date */ Date) => Unit): Self = this.set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setPosition(value: Left): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShowTime(value: Boolean): Self = this.set("showTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTime: Self = this.set("showTime", js.undefined)
  }
  
}

