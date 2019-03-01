package typings
package angularDashPromiseDashTrackerLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestShortcutConfig extends js.Object {
  var tracker: js.UndefOr[
    angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs.PromiseTracker | js.Array[angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs.PromiseTracker]
  ] = js.undefined
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(
    tracker: angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs.PromiseTracker | js.Array[angularDashPromiseDashTrackerLib.angularMod.promisetrackerNs.PromiseTracker] = null
  ): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    if (tracker != null) __obj.updateDynamic("tracker")(tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
}

