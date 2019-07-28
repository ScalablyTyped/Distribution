package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsForPolicyResponse extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * The policy targets.
    */
  var targets: js.UndefOr[PolicyTargets] = js.undefined
}

object ListTargetsForPolicyResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, targets: PolicyTargets = null): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker)
    if (targets != null) __obj.updateDynamic("targets")(targets)
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
}

