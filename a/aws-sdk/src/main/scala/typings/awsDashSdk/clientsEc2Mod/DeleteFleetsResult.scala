package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFleetsResult extends js.Object {
  /**
    * Information about the EC2 Fleets that are successfully deleted.
    */
  var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet] = js.native
  /**
    * Information about the EC2 Fleets that are not successfully deleted.
    */
  var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet] = js.native
}

object DeleteFleetsResult {
  @scala.inline
  def apply(
    SuccessfulFleetDeletions: DeleteFleetSuccessSet = null,
    UnsuccessfulFleetDeletions: DeleteFleetErrorSet = null
  ): DeleteFleetsResult = {
    val __obj = js.Dynamic.literal()
    if (SuccessfulFleetDeletions != null) __obj.updateDynamic("SuccessfulFleetDeletions")(SuccessfulFleetDeletions.asInstanceOf[js.Any])
    if (UnsuccessfulFleetDeletions != null) __obj.updateDynamic("UnsuccessfulFleetDeletions")(UnsuccessfulFleetDeletions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetsResult]
  }
}

