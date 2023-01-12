package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySnapshotRequest extends StObject {
  
  /**
    * A description for the EBS snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost to which to copy the snapshot. Only specify this parameter when copying a snapshot from an Amazon Web Services Region to an Outpost. The snapshot must be in the Region for the destination Outpost. You cannot copy a snapshot from an Outpost to a Region, from one Outpost to another, or within the same Outpost. For more information, see  Copy snapshots from an Amazon Web Services Region to an Outpost in the Amazon Elastic Compute Cloud User Guide.
    */
  var DestinationOutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The destination Region to use in the PresignedUrl parameter of a snapshot copy operation. This parameter is only valid for specifying the destination Region in a PresignedUrl parameter, where it is required. The snapshot copy is sent to the regional endpoint that you sent the HTTP request to (for example, ec2.us-east-1.amazonaws.com). With the CLI, this is specified using the --region parameter or the default Region in your Amazon Web Services configuration file.
    */
  var DestinationRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Otherwise, omit this parameter. Encrypted snapshots are encrypted, even if you omit this parameter and encryption by default is not enabled. You cannot set this parameter to false. For more information, see Amazon EBS encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the Key Management Service (KMS) KMS key to use for Amazon EBS encryption. If this parameter is not specified, your KMS key for Amazon EBS is used. If KmsKeyId is specified, the encrypted state must be true. You can specify the KMS key using any of the following:   Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias. For example, alias/ExampleAlias.   Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an ID, alias, or ARN that is not valid, the action can appear to complete, but eventually fails.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEc2Mod.KmsKeyId] = js.undefined
  
  /**
    * When you copy an encrypted source snapshot using the Amazon EC2 Query API, you must supply a pre-signed URL. This parameter is optional for unencrypted snapshots. For more information, see Query requests. The PresignedUrl should use the snapshot source endpoint, the CopySnapshot action, and include the SourceRegion, SourceSnapshotId, and DestinationRegion parameters. The PresignedUrl must be signed using Amazon Web Services Signature Version 4. Because EBS snapshots are stored in Amazon S3, the signing algorithm for this parameter uses the same logic that is described in Authenticating Requests: Using Query Parameters (Amazon Web Services Signature Version 4) in the Amazon Simple Storage Service API Reference. An invalid or improperly signed PresignedUrl will cause the copy operation to fail asynchronously, and the snapshot will move to an error state.
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
  
  /**
    * The tags to apply to the new snapshot.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CopySnapshotRequest {
  
  inline def apply(SourceRegion: String, SourceSnapshotId: String): CopySnapshotRequest = {
    val __obj = js.Dynamic.literal(SourceRegion = SourceRegion.asInstanceOf[js.Any], SourceSnapshotId = SourceSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopySnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationOutpostArn(value: String): Self = StObject.set(x, "DestinationOutpostArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationOutpostArnUndefined: Self = StObject.set(x, "DestinationOutpostArn", js.undefined)
    
    inline def setDestinationRegion(value: String): Self = StObject.set(x, "DestinationRegion", value.asInstanceOf[js.Any])
    
    inline def setDestinationRegionUndefined: Self = StObject.set(x, "DestinationRegion", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPresignedUrl(value: String): Self = StObject.set(x, "PresignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPresignedUrlUndefined: Self = StObject.set(x, "PresignedUrl", js.undefined)
    
    inline def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotId(value: String): Self = StObject.set(x, "SourceSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
