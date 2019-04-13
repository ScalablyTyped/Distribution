package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePolicyRequest extends js.Object {
  /**
    * The unique identifier (ID) of the policy that you want details about. You can get the ID from the ListPolicies or ListPoliciesForTarget operations. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var PolicyId: awsDashSdkLib.clientsOrganizationsMod.PolicyId
}

object DescribePolicyRequest {
  @scala.inline
  def apply(PolicyId: PolicyId): DescribePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyId = PolicyId)
  
    __obj.asInstanceOf[DescribePolicyRequest]
  }
}

