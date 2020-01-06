package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoliciesResponse extends js.Object {
  /**
    * A map of policy names to policies.
    */
  var Policies: PolicyMap = js.native
}

object GetIdentityPoliciesResponse {
  @scala.inline
  def apply(Policies: PolicyMap): GetIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(Policies = Policies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetIdentityPoliciesResponse]
  }
}

