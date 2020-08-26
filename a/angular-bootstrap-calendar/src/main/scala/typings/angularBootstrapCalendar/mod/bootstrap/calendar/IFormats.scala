package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFormats extends js.Object {
  var date: IDateFormats = js.native
  var title: ITitleFormats = js.native
}

object IFormats {
  @scala.inline
  def apply(date: IDateFormats, title: ITitleFormats): IFormats = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormats]
  }
  @scala.inline
  implicit class IFormatsOps[Self <: IFormats] (val x: Self) extends AnyVal {
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
    def setDate(value: IDateFormats): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ITitleFormats): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

