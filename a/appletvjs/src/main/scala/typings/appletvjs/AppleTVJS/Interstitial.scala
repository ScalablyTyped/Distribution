package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interstitial extends js.Object {
  /** The duration of the interstitial. */
  var duration: Double = js.native
  /** The starttime of the interstitial. */
  var starttime: Double = js.native
}

object Interstitial {
  @scala.inline
  def apply(duration: Double, starttime: Double): Interstitial = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interstitial]
  }
  @scala.inline
  implicit class InterstitialOps[Self <: Interstitial] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setStarttime(value: Double): Self = this.set("starttime", value.asInstanceOf[js.Any])
  }
  
}

