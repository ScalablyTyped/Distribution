package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEbsDefaultKmsKeyIdRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the volume. This parameter is only required if you want to use a customer-managed CMK; if this parameter is not specified, your AWS-managed CMK for the account is used. If a KmsKeyId is specified, the Encrypted flag must also be set.  The CMK identifier may be provided in any of the following formats:    Key ID: For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias: For example, alias/ExampleAlias.    Key ARN: The key ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the key namespace, and then the CMK ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.    Alias ARN: The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.    AWS authenticates KmsKeyId asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. The action will eventually fail. 
    */
  var KmsKeyId: String
}

object ModifyEbsDefaultKmsKeyIdRequest {
  @scala.inline
  def apply(KmsKeyId: String, DryRun: js.UndefOr[Boolean] = js.undefined): ModifyEbsDefaultKmsKeyIdRequest = {
    val __obj = js.Dynamic.literal(KmsKeyId = KmsKeyId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[ModifyEbsDefaultKmsKeyIdRequest]
  }
}

