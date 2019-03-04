package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateLocaleProvider extends js.Object {
  var dates: js.Array[java.lang.String]
  var days: js.Array[java.lang.String]
  var firstDayOfWeek: scala.Double
  var months: js.Array[java.lang.String]
  var msgCalendar: java.lang.String
  var msgOpenCalendar: java.lang.String
  var shortDays: js.Array[java.lang.String]
  var shortMonths: js.Array[java.lang.String]
  def formatDate(date: stdLib.Date): java.lang.String
  def monthHeaderFormatter(date: stdLib.Date): java.lang.String
  def parseDate(dateString: java.lang.String): stdLib.Date
  def weekNumberFormatter(weekNumber: scala.Double): java.lang.String
}

object IDateLocaleProvider {
  @scala.inline
  def apply(
    dates: js.Array[java.lang.String],
    days: js.Array[java.lang.String],
    firstDayOfWeek: scala.Double,
    formatDate: js.Function1[stdLib.Date, java.lang.String],
    monthHeaderFormatter: js.Function1[stdLib.Date, java.lang.String],
    months: js.Array[java.lang.String],
    msgCalendar: java.lang.String,
    msgOpenCalendar: java.lang.String,
    parseDate: js.Function1[java.lang.String, stdLib.Date],
    shortDays: js.Array[java.lang.String],
    shortMonths: js.Array[java.lang.String],
    weekNumberFormatter: js.Function1[scala.Double, java.lang.String]
  ): IDateLocaleProvider = {
    val __obj = js.Dynamic.literal(dates = dates, days = days, firstDayOfWeek = firstDayOfWeek, formatDate = formatDate, monthHeaderFormatter = monthHeaderFormatter, months = months, msgCalendar = msgCalendar, msgOpenCalendar = msgOpenCalendar, parseDate = parseDate, shortDays = shortDays, shortMonths = shortMonths, weekNumberFormatter = weekNumberFormatter)
  
    __obj.asInstanceOf[IDateLocaleProvider]
  }
}

