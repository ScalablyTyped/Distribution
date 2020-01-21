package typings.adhan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adhan", "PrayerTimes")
@js.native
class PrayerTimes protected () extends js.Object {
  def this(coordinates: Coordinates, date: typings.std.Date, params: Parameter) = this()
  var asr: typings.std.Date = js.native
  var dhuhr: typings.std.Date = js.native
  var fajr: typings.std.Date = js.native
  var isha: typings.std.Date = js.native
  var maghrib: typings.std.Date = js.native
  var sunrise: typings.std.Date = js.native
}

