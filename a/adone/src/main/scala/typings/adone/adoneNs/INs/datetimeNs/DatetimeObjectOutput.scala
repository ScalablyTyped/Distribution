package typings.adone.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeObjectOutput extends js.Object {
  /* Day of the month */
  var date: Double
  var hours: Double
  var milliseconds: Double
  var minutes: Double
  /* One digit */
  var months: Double
  var seconds: Double
  var years: Double
}

object DatetimeObjectOutput {
  @scala.inline
  def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    months: Double,
    seconds: Double,
    years: Double
  ): DatetimeObjectOutput = {
    val __obj = js.Dynamic.literal(date = date, hours = hours, milliseconds = milliseconds, minutes = minutes, months = months, seconds = seconds, years = years)
  
    __obj.asInstanceOf[DatetimeObjectOutput]
  }
}

