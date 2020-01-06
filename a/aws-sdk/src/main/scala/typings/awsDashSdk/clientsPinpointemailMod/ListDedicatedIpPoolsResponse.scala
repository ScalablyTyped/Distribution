package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDedicatedIpPoolsResponse extends js.Object {
  /**
    * A list of all of the dedicated IP pools that are associated with your Amazon Pinpoint account.
    */
  var DedicatedIpPools: js.UndefOr[ListOfDedicatedIpPools] = js.native
  /**
    * A token that indicates that there are additional IP pools to list. To view additional IP pools, issue another request to ListDedicatedIpPools, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.NextToken] = js.native
}

object ListDedicatedIpPoolsResponse {
  @scala.inline
  def apply(DedicatedIpPools: ListOfDedicatedIpPools = null, NextToken: NextToken = null): ListDedicatedIpPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (DedicatedIpPools != null) __obj.updateDynamic("DedicatedIpPools")(DedicatedIpPools.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDedicatedIpPoolsResponse]
  }
}

