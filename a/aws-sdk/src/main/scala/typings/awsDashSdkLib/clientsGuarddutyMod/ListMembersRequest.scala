package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMembersRequest extends js.Object {
  /**
    * The unique ID of the detector of the GuardDuty account whose members you want to list.
    */
  var DetectorId: __string
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 1. The maximum value is 50.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListMembers action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * Specifies what member accounts the response is to include based on their relationship status with the master account. The default value is TRUE. If onlyAssociated is set to TRUE, the response will include member accounts whose relationship status with the master is set to Enabled, Disabled. If onlyAssociated is set to FALSE, the response will include all existing member accounts.
    */
  var OnlyAssociated: js.UndefOr[__string] = js.undefined
}

object ListMembersRequest {
  @scala.inline
  def apply(
    DetectorId: __string,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null,
    OnlyAssociated: __string = null
  ): ListMembersRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OnlyAssociated != null) __obj.updateDynamic("OnlyAssociated")(OnlyAssociated)
    __obj.asInstanceOf[ListMembersRequest]
  }
}

