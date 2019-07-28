package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to delete. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
}

object DeletePolicyRequest {
  @scala.inline
  def apply(PolicyArn: arnType): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn)
  
    __obj.asInstanceOf[DeletePolicyRequest]
  }
}

