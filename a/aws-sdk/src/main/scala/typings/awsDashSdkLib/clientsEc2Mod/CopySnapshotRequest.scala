package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotRequest extends js.Object {
  /**
    * A description for the EBS snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The destination Region to use in the PresignedUrl parameter of a snapshot copy operation. This parameter is only valid for specifying the destination Region in a PresignedUrl parameter, where it is required. The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example, ec2.us-east-1.amazonaws.com). With the AWS CLI, this is specified using the --region parameter or the default Region in your AWS configuration file.
    */
  var DestinationRegion: js.UndefOr[String] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The identifier of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for Amazon EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used. If KmsKeyId is specified, the encrypted state must be true. You can specify the CMK using any of the following:   Key ID. For example, key/1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias. For example, alias/ExampleAlias.   Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   AWS authenticates the CMK asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This parameter is optional for unencrypted snapshots. For more information, see Query Requests. The PresignedUrl should use the snapshot source endpoint, the CopySnapshot action, and include the SourceRegion, SourceSnapshotId, and DestinationRegion parameters. The PresignedUrl must be signed using AWS Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in Authenticating Requests by Using Query Parameters (AWS Signature Version 4) in the Amazon Simple Storage Service API Reference. An invalid or improperly signed PresignedUrl will cause the copy operation to fail asynchronously, and the snapshot will move to an error state.
    */
  var PresignedUrl: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Region that contains the snapshot to be copied.
    */
  var SourceRegion: String
  /**
    * The ID of the EBS snapshot to copy.
    */
  var SourceSnapshotId: String
}

object CopySnapshotRequest {
  @scala.inline
  def apply(
    SourceRegion: String,
    SourceSnapshotId: String,
    Description: String = null,
    DestinationRegion: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    KmsKeyId: String = null,
    PresignedUrl: String = null
  ): CopySnapshotRequest = {
    val __obj = js.Dynamic.literal(SourceRegion = SourceRegion, SourceSnapshotId = SourceSnapshotId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DestinationRegion != null) __obj.updateDynamic("DestinationRegion")(DestinationRegion)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (PresignedUrl != null) __obj.updateDynamic("PresignedUrl")(PresignedUrl)
    __obj.asInstanceOf[CopySnapshotRequest]
  }
}

