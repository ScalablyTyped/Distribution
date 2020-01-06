package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVPCAssociationAuthorizationsResponse extends js.Object {
  /**
    * The ID of the hosted zone that you can associate the listed VPCs with.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * When the response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of VPCs, submit another ListVPCAssociationAuthorizations request, and include the value of the NextToken element from the response in the nexttoken request parameter.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of VPCs that are authorized to be associated with the specified hosted zone.
    */
  var VPCs: typings.awsDashSdk.clientsRoute53Mod.VPCs = js.native
}

object ListVPCAssociationAuthorizationsResponse {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPCs: VPCs, NextToken: PaginationToken = null): ListVPCAssociationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPCs = VPCs.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVPCAssociationAuthorizationsResponse]
  }
}

