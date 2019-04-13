package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeFlowEntitlementResponse extends js.Object {
  /**
    * The ARN of the entitlement that was revoked.
    */
  var EntitlementArn: js.UndefOr[__string] = js.undefined
  /**
    * The ARN of the flow that the entitlement was revoked from.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
}

object RevokeFlowEntitlementResponse {
  @scala.inline
  def apply(EntitlementArn: __string = null, FlowArn: __string = null): RevokeFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    if (EntitlementArn != null) __obj.updateDynamic("EntitlementArn")(EntitlementArn)
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    __obj.asInstanceOf[RevokeFlowEntitlementResponse]
  }
}

