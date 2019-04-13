package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFlowEntitlementResponse extends js.Object {
  var Entitlement: js.UndefOr[Entitlement] = js.undefined
  /**
    * The ARN of the flow that this entitlement was granted on.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
}

object UpdateFlowEntitlementResponse {
  @scala.inline
  def apply(Entitlement: Entitlement = null, FlowArn: __string = null): UpdateFlowEntitlementResponse = {
    val __obj = js.Dynamic.literal()
    if (Entitlement != null) __obj.updateDynamic("Entitlement")(Entitlement)
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    __obj.asInstanceOf[UpdateFlowEntitlementResponse]
  }
}

