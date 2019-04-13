package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachPrincipalPolicyRequest extends js.Object {
  /**
    * The policy name.
    */
  var policyName: PolicyName
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal
}

object AttachPrincipalPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, principal: Principal): AttachPrincipalPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName, principal = principal)
  
    __obj.asInstanceOf[AttachPrincipalPolicyRequest]
  }
}

