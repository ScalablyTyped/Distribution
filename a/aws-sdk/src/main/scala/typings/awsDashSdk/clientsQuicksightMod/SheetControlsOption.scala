package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetControlsOption extends js.Object {
  /**
    * Visibility state.
    */
  var VisibilityState: js.UndefOr[DashboardUIState] = js.native
}

object SheetControlsOption {
  @scala.inline
  def apply(VisibilityState: DashboardUIState = null): SheetControlsOption = {
    val __obj = js.Dynamic.literal()
    if (VisibilityState != null) __obj.updateDynamic("VisibilityState")(VisibilityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetControlsOption]
  }
}

