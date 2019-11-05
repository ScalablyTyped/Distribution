package typings.adhan.adhanMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adhan", "PrayerTimes")
@js.native
class PrayerTimes protected () extends js.Object {
  def this(coordinates: Coordinates, date: Date, params: Paramater) = this()
  var asr: Date = js.native
  var dhuhr: Date = js.native
  var fajr: Date = js.native
  var isha: Date = js.native
  var maghrib: Date = js.native
  var sunrise: Date = js.native
}

