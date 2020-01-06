package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFlowEntitlementResponse extends js.Object {
  var Entitlement: js.UndefOr[typings.awsDashSdk.clientsMediaconnectMod.Entitlement] = js.native
  /**
    * The ARN of the flow that this entitlement was granted on.
    */
  var FlowArn: js.UndefOr[__string] = js.native
}

object UpdateFlowEntitlementResponse {
  @scala.inline
  def apply(Entitlement: Entitlement = null, FlowArn: __string = null): UpdateFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    if (Entitlement != null) __obj.updateDynamic("Entitlement")(Entitlement.asInstanceOf[js.Any])
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowEntitlementResponse]
  }
}

