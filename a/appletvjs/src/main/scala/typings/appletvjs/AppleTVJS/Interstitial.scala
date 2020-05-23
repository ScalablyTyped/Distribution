package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interstitial extends js.Object {
  /** The duration of the interstitial. */
  var duration: Double
  /** The starttime of the interstitial. */
  var starttime: Double
}

object Interstitial {
  @scala.inline
  def apply(duration: Double, starttime: Double): Interstitial = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], starttime = starttime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interstitial]
  }
}

