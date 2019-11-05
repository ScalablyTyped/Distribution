package typings.adhan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asr extends js.Object {
  var asr: Double
  var dhuhr: Double
  var fajr: Double
  var isha: Double
  var maghrib: Double
  var sunrise: Double
}

object Anon_Asr {
  @scala.inline
  def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): Anon_Asr = {
    val __obj = js.Dynamic.literal(asr = asr, dhuhr = dhuhr, fajr = fajr, isha = isha, maghrib = maghrib, sunrise = sunrise)
  
    __obj.asInstanceOf[Anon_Asr]
  }
}

