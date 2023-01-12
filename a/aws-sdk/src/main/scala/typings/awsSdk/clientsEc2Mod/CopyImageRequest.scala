package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyImageRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure idempotency of the request. For more information, see Ensuring idempotency in the Amazon EC2 API Reference.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the new AMI in the destination Region.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost to which to copy the AMI. Only specify this parameter when copying an AMI from an Amazon Web Services Region to an Outpost. The AMI must be in the Region of the destination Outpost. You cannot copy an AMI from an Outpost to a Region, from one Outpost to another, or within the same Outpost. For more information, see  Copying AMIs from an Amazon Web Services Region to an Outpost in the Amazon Elastic Compute Cloud User Guide.
    */
  var DestinationOutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the destination snapshots of the copied image should be encrypted. You can encrypt a copy of an unencrypted snapshot, but you cannot create an unencrypted copy of an encrypted snapshot. The default KMS key for Amazon EBS is used unless you specify a non-default Key Management Service (KMS) KMS key using KmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the symmetric Key Management Service (KMS) KMS key to use when creating encrypted volumes. If this parameter is not specified, your Amazon Web Services managed KMS key for Amazon EBS is used. If you specify a KMS key, you must also set the encrypted state to true. You can specify a KMS key using any of the following:   Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.   Key alias. For example, alias/ExampleAlias.   Key ARN. For example, arn:aws:kms:us-east-1:012345678910:key/1234abcd-12ab-34cd-56ef-1234567890ab.   Alias ARN. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   Amazon Web Services authenticates the KMS key asynchronously. Therefore, if you specify an identifier that is not valid, the action can appear to complete, but eventually fails. The specified KMS key must exist in the destination Region. Amazon EBS does not support asymmetric KMS keys.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEc2Mod.KmsKeyId] = js.undefined
  
  /**
    * The name of the new AMI in the destination Region.
    */
  var Name: String
  
  /**
    * The ID of the AMI to copy.
    */
  var SourceImageId: String
  
  /**
    * The name of the Region that contains the AMI to copy.
    */
  var SourceRegion: String
}
object CopyImageRequest {
  
  inline def apply(Name: String, SourceImageId: String, SourceRegion: String): CopyImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyImageRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDestinationOutpostArn(value: String): Self = StObject.set(x, "DestinationOutpostArn", value.asInstanceOf[js.Any])
    
    inline def setDestinationOutpostArnUndefined: Self = StObject.set(x, "DestinationOutpostArn", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSourceImageId(value: String): Self = StObject.set(x, "SourceImageId", value.asInstanceOf[js.Any])
    
    inline def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
  }
}
