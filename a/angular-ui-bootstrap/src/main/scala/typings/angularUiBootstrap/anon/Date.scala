package typings.angularUiBootstrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var date: js.UndefOr[String] = js.native
  var `datetime-local`: js.UndefOr[String] = js.native
  var month: js.UndefOr[String] = js.native
}

object Date {
  @scala.inline
  def apply(): Date = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
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
    def `setDatetime-local`(value: String): Self = this.set("datetime-local", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDatetime-local`: Self = this.set("datetime-local", js.undefined)
    @scala.inline
    def setMonth(value: String): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
  }
  
}

