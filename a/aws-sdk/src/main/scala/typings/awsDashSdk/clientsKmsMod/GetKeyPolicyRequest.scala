package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyPolicyRequest extends js.Object {
  /**
    * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  /**
    * Specifies the name of the key policy. The only valid name is default. To get the names of key policies, use ListKeyPolicies.
    */
  var PolicyName: PolicyNameType
}

object GetKeyPolicyRequest {
  @scala.inline
  def apply(KeyId: KeyIdType, PolicyName: PolicyNameType): GetKeyPolicyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId, PolicyName = PolicyName)
  
    __obj.asInstanceOf[GetKeyPolicyRequest]
  }
}

