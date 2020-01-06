package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTransitGatewayMulticastGroupsResult extends js.Object {
  /**
    * Information about the transit gateway multicast group.
    */
  var MulticastGroups: js.UndefOr[TransitGatewayMulticastGroupList] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SearchTransitGatewayMulticastGroupsResult {
  @scala.inline
  def apply(MulticastGroups: TransitGatewayMulticastGroupList = null, NextToken: String = null): SearchTransitGatewayMulticastGroupsResult = {
    val __obj = js.Dynamic.literal()
    if (MulticastGroups != null) __obj.updateDynamic("MulticastGroups")(MulticastGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTransitGatewayMulticastGroupsResult]
  }
}

