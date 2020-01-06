package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantFlowEntitlementsRequest extends js.Object {
  /**
    * The list of entitlements that you want to grant.
    */
  var Entitlements: __listOfGrantEntitlementRequest = js.native
  /**
    * The flow that you want to grant entitlements on.
    */
  var FlowArn: __string = js.native
}

object GrantFlowEntitlementsRequest {
  @scala.inline
  def apply(Entitlements: __listOfGrantEntitlementRequest, FlowArn: __string): GrantFlowEntitlementsRequest = {
    val __obj = js.Dynamic.literal(Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GrantFlowEntitlementsRequest]
  }
}

