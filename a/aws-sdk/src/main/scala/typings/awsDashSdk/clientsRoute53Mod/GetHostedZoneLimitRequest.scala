package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneLimitRequest extends js.Object {
  /**
    * The ID of the hosted zone that you want to get a limit for.
    */
  var HostedZoneId: ResourceId
  /**
    * The limit that you want to get. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
    */
  var Type: HostedZoneLimitType
}

object GetHostedZoneLimitRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, Type: HostedZoneLimitType): GetHostedZoneLimitRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHostedZoneLimitRequest]
  }
}

