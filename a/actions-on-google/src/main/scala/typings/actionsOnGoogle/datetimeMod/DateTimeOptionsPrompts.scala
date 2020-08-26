package typings.actionsOnGoogle.datetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeOptionsPrompts extends js.Object {
  /**
    * The prompt used to specifically ask for the date if not provided by user.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var date: js.UndefOr[String] = js.native
  /**
    * The initial prompt used to ask for a date and time.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var initial: js.UndefOr[String] = js.native
  /**
    * The prompt used to specifically ask for the time if not provided by user.
    * If not provided, Google will use a generic prompt.
    * @public
    */
  var time: js.UndefOr[String] = js.native
}

object DateTimeOptionsPrompts {
  @scala.inline
  def apply(): DateTimeOptionsPrompts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptionsPrompts]
  }
  @scala.inline
  implicit class DateTimeOptionsPromptsOps[Self <: DateTimeOptionsPrompts] (val x: Self) extends AnyVal {
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
    def setInitial(value: String): Self = this.set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

