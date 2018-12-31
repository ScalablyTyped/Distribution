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

