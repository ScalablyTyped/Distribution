package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountPasswordPolicyResponse extends js.Object {
  /**
    * A structure that contains details about the account's password policy.
    */
  var PasswordPolicy: typings.awsDashSdk.clientsIamMod.PasswordPolicy
}

object GetAccountPasswordPolicyResponse {
  @scala.inline
  def apply(PasswordPolicy: PasswordPolicy): GetAccountPasswordPolicyResponse = {
    val __obj = js.Dynamic.literal(PasswordPolicy = PasswordPolicy)
  
    __obj.asInstanceOf[GetAccountPasswordPolicyResponse]
  }
}

