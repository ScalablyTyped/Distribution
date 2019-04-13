package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePolicyRequest extends js.Object {
  /**
    * The JSON document that describes the policy. policyDocument must have a minimum length of 1, with a maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument
  /**
    * The policy name.
    */
  var policyName: PolicyName
}

object CreatePolicyRequest {
  @scala.inline
  def apply(policyDocument: PolicyDocument, policyName: PolicyName): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument, policyName = policyName)
  
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

