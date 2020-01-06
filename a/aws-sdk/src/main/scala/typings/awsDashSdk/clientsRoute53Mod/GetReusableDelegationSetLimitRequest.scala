package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReusableDelegationSetLimitRequest extends js.Object {
  /**
    * The ID of the delegation set that you want to get the limit for.
    */
  var DelegationSetId: ResourceId = js.native
  /**
    * Specify MAX_ZONES_BY_REUSABLE_DELEGATION_SET to get the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
}

object GetReusableDelegationSetLimitRequest {
  @scala.inline
  def apply(DelegationSetId: ResourceId, Type: ReusableDelegationSetLimitType): GetReusableDelegationSetLimitRequest = {
    val __obj = js.Dynamic.literal(DelegationSetId = DelegationSetId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetReusableDelegationSetLimitRequest]
  }
}

