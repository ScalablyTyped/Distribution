package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateFormats extends js.Object {
  var datetime: String
  var day: String
  var hour: String
  var month: String
  var time: String
  var weekDay: String
}

object IDateFormats {
  @scala.inline
  def apply(datetime: String, day: String, hour: String, month: String, time: String, weekDay: String): IDateFormats = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], weekDay = weekDay.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateFormats]
  }
}

