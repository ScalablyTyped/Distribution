package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutKeyPolicyRequest extends js.Object {
  /**
    * A flag to indicate whether to bypass the key policy lockout safety check.  Setting this value to true increases the risk that the CMK becomes unmanageable. Do not set this value to true indiscriminately. For more information, refer to the scenario in the Default Key Policy section in the AWS Key Management Service Developer Guide.  Use this parameter only when you intend to prevent the principal that is making the request from making a subsequent PutKeyPolicy request on the CMK. The default value is false.
    */
  var BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
  /**
    * A unique identifier for the customer master key (CMK). Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  /**
    * The key policy to attach to the CMK. The key policy must meet the following criteria:   If you don't set BypassPolicyLockoutSafetyCheck to true, the key policy must allow the principal that is making the PutKeyPolicy request to make a subsequent PutKeyPolicy request on the CMK. This reduces the risk that the CMK becomes unmanageable. For more information, refer to the scenario in the Default Key Policy section of the AWS Key Management Service Developer Guide.   Each statement in the key policy must contain one or more principals. The principals in the key policy must exist and be visible to AWS KMS. When you create a new AWS principal (for example, an IAM user or role), you might need to enforce a delay before including the new principal in a key policy because the new principal might not be immediately visible to AWS KMS. For more information, see Changes that I make are not always immediately visible in the AWS Identity and Access Management User Guide.   The key policy size limit is 32 kilobytes (32768 bytes).
    */
  var Policy: PolicyType
  /**
    * The name of the key policy. The only valid value is default.
    */
  var PolicyName: PolicyNameType
}

object PutKeyPolicyRequest {
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    Policy: PolicyType,
    PolicyName: PolicyNameType,
    BypassPolicyLockoutSafetyCheck: js.UndefOr[BooleanType] = js.undefined
  ): PutKeyPolicyRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId, Policy = Policy, PolicyName = PolicyName)
    if (!js.isUndefined(BypassPolicyLockoutSafetyCheck)) __obj.updateDynamic("BypassPolicyLockoutSafetyCheck")(BypassPolicyLockoutSafetyCheck)
    __obj.asInstanceOf[PutKeyPolicyRequest]
  }
}

