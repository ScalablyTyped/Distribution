package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDefaultPolicyVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy whose default version you want to set. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
  /**
    * The version of the policy to set as the default (operative) version. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  var VersionId: policyVersionIdType
}

object SetDefaultPolicyVersionRequest {
  @scala.inline
  def apply(PolicyArn: arnType, VersionId: policyVersionIdType): SetDefaultPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn, VersionId = VersionId)
  
    __obj.asInstanceOf[SetDefaultPolicyVersionRequest]
  }
}

