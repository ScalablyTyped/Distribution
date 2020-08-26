package typings.adhan.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asr extends js.Object {
  var asr: Double = js.native
  var dhuhr: Double = js.native
  var fajr: Double = js.native
  var isha: Double = js.native
  var maghrib: Double = js.native
  var sunrise: Double = js.native
}

object Asr {
  @scala.inline
  def apply(asr: Double, dhuhr: Double, fajr: Double, isha: Double, maghrib: Double, sunrise: Double): Asr = {
    val __obj = js.Dynamic.literal(asr = asr.asInstanceOf[js.Any], dhuhr = dhuhr.asInstanceOf[js.Any], fajr = fajr.asInstanceOf[js.Any], isha = isha.asInstanceOf[js.Any], maghrib = maghrib.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asr]
  }
  @scala.inline
  implicit class AsrOps[Self <: Asr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsr(value: Double): Self = this.set("asr", value.asInstanceOf[js.Any])
    @scala.inline
    def setDhuhr(value: Double): Self = this.set("dhuhr", value.asInstanceOf[js.Any])
    @scala.inline
    def setFajr(value: Double): Self = this.set("fajr", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsha(value: Double): Self = this.set("isha", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaghrib(value: Double): Self = this.set("maghrib", value.asInstanceOf[js.Any])
    @scala.inline
    def setSunrise(value: Double): Self = this.set("sunrise", value.asInstanceOf[js.Any])
  }
  
}

