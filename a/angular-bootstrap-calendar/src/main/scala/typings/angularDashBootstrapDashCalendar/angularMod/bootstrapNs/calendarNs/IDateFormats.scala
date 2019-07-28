package typings.angularDashBootstrapDashCalendar.angularMod.bootstrapNs.calendarNs

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
    val __obj = js.Dynamic.literal(datetime = datetime, day = day, hour = hour, month = month, time = time, weekDay = weekDay)
  
    __obj.asInstanceOf[IDateFormats]
  }
}

