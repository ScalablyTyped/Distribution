package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportSnapshotRequest extends js.Object {
  /**
    * The client-specific data.
    */
  var ClientData: js.UndefOr[ClientData] = js.undefined
  /**
    * Token to enable idempotency for VM import requests.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The description string for the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Information about the disk container.
    */
  var DiskContainer: js.UndefOr[SnapshotDiskContainer] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether the destination snapshot of the imported image should be encrypted. The default CMK for EBS is used unless you specify a non-default AWS Key Management Service (AWS KMS) CMK using KmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * An identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted snapshot. This parameter is only required if you want to use a non-default CMK; if this parameter is not specified, the default CMK for EBS is used. If a KmsKeyId is specified, the Encrypted flag must also be set.  The CMK identifier may be provided in any of the following formats:    Key ID   Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the key namespace, and then the CMK ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the CMK, the AWS account ID of the CMK owner, the alias namespace, and then the CMK alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.    AWS parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.  The specified CMK must exist in the Region that the snapshot is being copied to.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The name of the role to use when not using the default role, 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.undefined
}

object ImportSnapshotRequest {
  @scala.inline
  def apply(
    ClientData: ClientData = null,
    ClientToken: String = null,
    Description: String = null,
    DiskContainer: SnapshotDiskContainer = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: String = null,
    RoleName: String = null
  ): ImportSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientData != null) __obj.updateDynamic("ClientData")(ClientData)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DiskContainer != null) __obj.updateDynamic("DiskContainer")(DiskContainer)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName)
    __obj.asInstanceOf[ImportSnapshotRequest]
  }
}

