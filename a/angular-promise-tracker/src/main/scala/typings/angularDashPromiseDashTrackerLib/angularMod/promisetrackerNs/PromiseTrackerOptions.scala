package typings
package angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseTrackerOptions extends js.Object {
  var activationDelay: js.UndefOr[scala.Double] = js.undefined
  var minDuration: js.UndefOr[scala.Double] = js.undefined
}

object PromiseTrackerOptions {
  @scala.inline
  def apply(activationDelay: scala.Int | scala.Double = null, minDuration: scala.Int | scala.Double = null): PromiseTrackerOptions = {
    val __obj = js.Dynamic.literal()
    if (activationDelay != null) __obj.updateDynamic("activationDelay")(activationDelay.asInstanceOf[js.Any])
    if (minDuration != null) __obj.updateDynamic("minDuration")(minDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseTrackerOptions]
  }
}

