package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireCheckIn extends js.Object {
  /**
    * Whether require check in is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Duration between 5 and 20 minutes to determine when to release the room if it's not checked into. 
    */
  var ReleaseAfterMinutes: js.UndefOr[Minutes] = js.native
}

object RequireCheckIn {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[Boolean] = js.undefined,
    ReleaseAfterMinutes: js.UndefOr[Minutes] = js.undefined
  ): RequireCheckIn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReleaseAfterMinutes)) __obj.updateDynamic("ReleaseAfterMinutes")(ReleaseAfterMinutes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequireCheckIn]
  }
}

