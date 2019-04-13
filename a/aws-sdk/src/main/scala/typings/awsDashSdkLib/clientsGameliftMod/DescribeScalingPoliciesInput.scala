package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingPoliciesInput extends js.Object {
  /**
    * Unique identifier for a fleet to retrieve scaling policies for.
    */
  var FleetId: awsDashSdkLib.clientsGameliftMod.FleetId
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Scaling policy status to filter results on. A scaling policy is only in force when in an ACTIVE status.    ACTIVE -- The scaling policy is currently in force.    UPDATEREQUESTED -- A request to update the scaling policy has been received.    UPDATING -- A change is being made to the scaling policy.    DELETEREQUESTED -- A request to delete the scaling policy has been received.    DELETING -- The scaling policy is being deleted.    DELETED -- The scaling policy has been deleted.    ERROR -- An error occurred in creating the policy. It should be removed and recreated.  
    */
  var StatusFilter: js.UndefOr[ScalingStatusType] = js.undefined
}

object DescribeScalingPoliciesInput {
  @scala.inline
  def apply(
    FleetId: FleetId,
    Limit: js.UndefOr[PositiveInteger] = js.undefined,
    NextToken: NonZeroAndMaxString = null,
    StatusFilter: ScalingStatusType = null
  ): DescribeScalingPoliciesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StatusFilter != null) __obj.updateDynamic("StatusFilter")(StatusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeScalingPoliciesInput]
  }
}

