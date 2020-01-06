package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachPrincipalPolicyRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal = js.native
}

object AttachPrincipalPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, principal: Principal): AttachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any], principal = principal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachPrincipalPolicyRequest]
  }
}

