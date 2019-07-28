package typings.adone.adoneNs.INs.datetimeNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  def calendar(): String = js.native
  def calendar(key: CalendarKey): String = js.native
  def calendar(key: CalendarKey, m: Datetime): String = js.native
  def calendar(key: CalendarKey, m: Datetime, now: Datetime): String = js.native
  def firstDayOfWeek(): Double = js.native
  def firstDayOfYear(): Double = js.native
  def invalidDate(): String = js.native
  def isPM(input: String): Boolean = js.native
  def longDateFormat(key: LongDateFormatKey): String = js.native
  def meridiem(hour: Double, minute: Double, isLower: Boolean): String = js.native
  def months(): js.Array[String] = js.native
  def months(m: Datetime): String = js.native
  def months(m: Datetime, format: String): String = js.native
  def monthsParse(monthName: String, format: String, strict: Boolean): Double = js.native
  def monthsRegex(strict: Boolean): RegExp = js.native
  def monthsShort(): js.Array[String] = js.native
  def monthsShort(m: Datetime): String = js.native
  def monthsShort(m: Datetime, format: String): String = js.native
  def monthsShortRegex(strict: Boolean): RegExp = js.native
  def ordinal(n: Double): String = js.native
  def pastFuture(diff: Double, absRelTime: String): String = js.native
  def postformat(inp: String): String = js.native
  def preparse(inp: String): String = js.native
  def relativeTime(n: Double, withoutSuffix: Boolean, key: RelativeTimeKey, isFuture: Boolean): String = js.native
  def set(config: js.Object): Unit = js.native
  def week(m: Datetime): Double = js.native
  def weekdays(): js.Array[String] = js.native
  def weekdays(m: Datetime): String = js.native
  def weekdays(m: Datetime, format: String): String = js.native
  def weekdaysMin(): js.Array[String] = js.native
  def weekdaysMin(m: Datetime): String = js.native
  def weekdaysMinRegex(strict: Boolean): RegExp = js.native
  def weekdaysParse(weekdayName: String, format: String, strict: Boolean): Double = js.native
  def weekdaysRegex(strict: Boolean): RegExp = js.native
  def weekdaysShort(): js.Array[String] = js.native
  def weekdaysShort(m: Datetime): String = js.native
  def weekdaysShortRegex(strict: Boolean): RegExp = js.native
}

