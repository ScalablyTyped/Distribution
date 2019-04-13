package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFleetsResult extends js.Object {
  /**
    * Information about the EC2 Fleets that are successfully deleted.
    */
  var SuccessfulFleetDeletions: js.UndefOr[DeleteFleetSuccessSet] = js.undefined
  /**
    * Information about the EC2 Fleets that are not successfully deleted.
    */
  var UnsuccessfulFleetDeletions: js.UndefOr[DeleteFleetErrorSet] = js.undefined
}

object DeleteFleetsResult {
  @scala.inline
  def apply(
    SuccessfulFleetDeletions: DeleteFleetSuccessSet = null,
    UnsuccessfulFleetDeletions: DeleteFleetErrorSet = null
  ): DeleteFleetsResult = {
    val __obj = js.Dynamic.literal()
    if (SuccessfulFleetDeletions != null) __obj.updateDynamic("SuccessfulFleetDeletions")(SuccessfulFleetDeletions)
    if (UnsuccessfulFleetDeletions != null) __obj.updateDynamic("UnsuccessfulFleetDeletions")(UnsuccessfulFleetDeletions)
    __obj.asInstanceOf[DeleteFleetsResult]
  }
}

