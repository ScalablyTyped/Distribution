package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantFlowEntitlementsResponse extends js.Object {
  /**
    * The entitlements that were just granted.
    */
  var Entitlements: js.UndefOr[__listOfEntitlement] = js.undefined
  /**
    * The ARN of the flow that these entitlements were granted to.
    */
  var FlowArn: js.UndefOr[__string] = js.undefined
}

object GrantFlowEntitlementsResponse {
  @scala.inline
  def apply(Entitlements: __listOfEntitlement = null, FlowArn: __string = null): GrantFlowEntitlementsResponse = {
    val __obj = js.Dynamic.literal()
    if (Entitlements != null) __obj.updateDynamic("Entitlements")(Entitlements)
    if (FlowArn != null) __obj.updateDynamic("FlowArn")(FlowArn)
    __obj.asInstanceOf[GrantFlowEntitlementsResponse]
  }
}

