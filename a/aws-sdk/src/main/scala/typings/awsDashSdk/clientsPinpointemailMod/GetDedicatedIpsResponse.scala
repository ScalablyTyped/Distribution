package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDedicatedIpsResponse extends js.Object {
  /**
    * A list of dedicated IP addresses that are reserved for use by your Amazon Pinpoint account.
    */
  var DedicatedIps: js.UndefOr[DedicatedIpList] = js.undefined
  /**
    * A token that indicates that there are additional dedicated IP addresses to list. To view additional addresses, issue another request to GetDedicatedIps, passing this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.NextToken] = js.undefined
}

object GetDedicatedIpsResponse {
  @scala.inline
  def apply(DedicatedIps: DedicatedIpList = null, NextToken: NextToken = null): GetDedicatedIpsResponse = {
    val __obj = js.Dynamic.literal()
    if (DedicatedIps != null) __obj.updateDynamic("DedicatedIps")(DedicatedIps)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetDedicatedIpsResponse]
  }
}

