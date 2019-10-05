package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateLocaleProvider extends js.Object {
  var dates: js.Array[String]
  var days: js.Array[String]
  var firstDayOfWeek: Double
  var months: js.Array[String]
  var msgCalendar: String
  var msgOpenCalendar: String
  var shortDays: js.Array[String]
  var shortMonths: js.Array[String]
  def formatDate(date: Date): String
  def monthHeaderFormatter(date: Date): String
  def parseDate(dateString: String): Date
  def weekNumberFormatter(weekNumber: Double): String
}

object IDateLocaleProvider {
  @scala.inline
  def apply(
    dates: js.Array[String],
    days: js.Array[String],
    firstDayOfWeek: Double,
    formatDate: Date => String,
    monthHeaderFormatter: Date => String,
    months: js.Array[String],
    msgCalendar: String,
    msgOpenCalendar: String,
    parseDate: String => Date,
    shortDays: js.Array[String],
    shortMonths: js.Array[String],
    weekNumberFormatter: Double => String
  ): IDateLocaleProvider = {
    val __obj = js.Dynamic.literal(dates = dates, days = days, firstDayOfWeek = firstDayOfWeek, formatDate = js.Any.fromFunction1(formatDate), monthHeaderFormatter = js.Any.fromFunction1(monthHeaderFormatter), months = months, msgCalendar = msgCalendar, msgOpenCalendar = msgOpenCalendar, parseDate = js.Any.fromFunction1(parseDate), shortDays = shortDays, shortMonths = shortMonths, weekNumberFormatter = js.Any.fromFunction1(weekNumberFormatter))
  
    __obj.asInstanceOf[IDateLocaleProvider]
  }
}

