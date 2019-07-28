package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterCrossAccountAccessRoleRequest extends js.Object {
  /**
    * The ARN of the IAM role that grants Amazon Inspector access to AWS Services needed to perform security assessments. 
    */
  var roleArn: Arn
}

object RegisterCrossAccountAccessRoleRequest {
  @scala.inline
  def apply(roleArn: Arn): RegisterCrossAccountAccessRoleRequest = {
    val __obj = js.Dynamic.literal(roleArn = roleArn)
  
    __obj.asInstanceOf[RegisterCrossAccountAccessRoleRequest]
  }
}

