package typings.angularDashPromiseDashTracker.angularMod

import typings.angularDashPromiseDashTracker.angularMod.promisetrackerNs.PromiseTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestShortcutConfig extends js.Object {
  var tracker: js.UndefOr[PromiseTracker | js.Array[PromiseTracker]] = js.undefined
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(tracker: PromiseTracker | js.Array[PromiseTracker] = null): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    if (tracker != null) __obj.updateDynamic("tracker")(tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
}

