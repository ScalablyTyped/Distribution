package typings.adhan.adhanMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdhanDate extends js.Object {
  def dateByAddingDays(date: Date, days: Double): String = js.native
  def dateByAddingHours(date: Date, hours: Double): String = js.native
  def dateByAddingMinutes(date: Date, minutes: Double): String = js.native
  def dateByAddingSeconds(date: Date, seconds: Double): String = js.native
  def dayOfYear(date: Date): String = js.native
  def formattedTime(prayerTime: Date): String = js.native
  def formattedTime(prayerTime: Date, offset: Double): String = js.native
  def formattedTime(prayerTime: Date, offset: Double, style: TimeMode): String = js.native
  def julianDate(date: Date): String = js.native
  def roundedMinute(date: Date): String = js.native
}

