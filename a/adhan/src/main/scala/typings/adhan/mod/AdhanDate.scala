package typings.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdhanDate extends js.Object {
  
  def dateByAddingDays(date: typings.std.Date, days: Double): String = js.native
  
  def dateByAddingHours(date: typings.std.Date, hours: Double): String = js.native
  
  def dateByAddingMinutes(date: typings.std.Date, minutes: Double): String = js.native
  
  def dateByAddingSeconds(date: typings.std.Date, seconds: Double): String = js.native
  
  def dayOfYear(date: typings.std.Date): String = js.native
  
  def formattedTime(prayerTime: typings.std.Date): String = js.native
  def formattedTime(prayerTime: typings.std.Date, offset: js.UndefOr[scala.Nothing], style: TimeMode): String = js.native
  def formattedTime(prayerTime: typings.std.Date, offset: Double): String = js.native
  def formattedTime(prayerTime: typings.std.Date, offset: Double, style: TimeMode): String = js.native
  
  def julianDate(date: typings.std.Date): String = js.native
  
  def roundedMinute(date: typings.std.Date): String = js.native
}
