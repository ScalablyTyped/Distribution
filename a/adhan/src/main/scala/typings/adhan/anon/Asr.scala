package typings.adhan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Asr extends js.Object {
  var asr: Double
  var dhuhr: Double
  var fajr: Double
  var isha: Double
  var maghrib: Double
  var sunrise: Double
}

object Asr {
  @scala.inline
  def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): Asr = {
    val __obj = js.Dynamic.literal(asr = asr.asInstanceOf[js.Any], dhuhr = dhuhr.asInstanceOf[js.Any], fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any], maghrib = maghrib.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asr]
  }
}

