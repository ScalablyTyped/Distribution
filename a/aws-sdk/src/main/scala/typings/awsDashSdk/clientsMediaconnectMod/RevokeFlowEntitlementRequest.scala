package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeFlowEntitlementRequest extends js.Object {
  /**
    * The ARN of the entitlement that you want to revoke.
    */
  var EntitlementArn: __string
  /**
    * The flow that you want to revoke an entitlement from.
    */
  var FlowArn: __string
}

object RevokeFlowEntitlementRequest {
  @scala.inline
  def apply(EntitlementArn: __string, FlowArn: __string): RevokeFlowEntitlementRequest = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn, FlowArn = FlowArn)
  
    __obj.asInstanceOf[RevokeFlowEntitlementRequest]
  }
}

