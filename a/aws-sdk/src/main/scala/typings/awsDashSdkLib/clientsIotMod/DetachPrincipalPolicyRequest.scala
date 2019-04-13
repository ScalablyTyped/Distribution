package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachPrincipalPolicyRequest extends js.Object {
  /**
    * The name of the policy to detach.
    */
  var policyName: PolicyName
  /**
    * The principal. If the principal is a certificate, specify the certificate ARN. If the principal is an Amazon Cognito identity, specify the identity ID.
    */
  var principal: Principal
}

object DetachPrincipalPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, principal: Principal): DetachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, principal = principal)
  
    __obj.asInstanceOf[DetachPrincipalPolicyRequest]
  }
}

