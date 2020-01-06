package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantFlowEntitlementsResponse extends js.Object {
  /**
    * The entitlements that were just granted.
    */
  var Entitlements: js.UndefOr[__listOfEntitlement] = js.native
  /**
    * The ARN of the flow that these entitlements were granted to.
    */
  var FlowArn: js.UndefOr[__string] = js.native
}

object GrantFlowEntitlementsResponse {
  @scala.inline
  def apply(Entitlements: __listOfEntitlement = null, FlowArn: __string = null): GrantFlowEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements.asInstanceOf[js.Any])
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantFlowEntitlementsResponse]
  }
}

