package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSnapshotRequest extends StObject {
  
  /**
    * The client-specific data.
    */
  var ClientData: js.UndefOr[typings.awsSdk.clientsEc2Mod.ClientData] = js.undefined
  
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
    * Specifies whether the destination snapshot of the imported image should be encrypted. The default KMS key for EBS is used unless you specify a non-default KMS key using KmsKeyId. For more information, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An identifier for the symmetric KMS key to use when creating the encrypted snapshot. This parameter is only required if you want to use a non-default KMS key; if this parameter is not specified, the default KMS key for EBS is used. If a KmsKeyId is specified, the Encrypted flag must also be set.  The KMS key identifier may be provided in any of the following formats:    Key ID   Key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.   ARN using key ID. The ID ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the key namespace, and then the key ID. For example, arn:aws:kms:us-east-1:012345678910:key/abcd1234-a123-456a-a12b-a123b4cd56ef.   ARN using key alias. The alias ARN contains the arn:aws:kms namespace, followed by the Region of the key, the Amazon Web Services account ID of the key owner, the alias namespace, and then the key alias. For example, arn:aws:kms:us-east-1:012345678910:alias/ExampleAlias.    Amazon Web Services parses KmsKeyId asynchronously, meaning that the action you call may appear to complete even though you provided an invalid identifier. This action will eventually report failure.  The specified KMS key must exist in the Region that the snapshot is being copied to. Amazon EBS does not support asymmetric KMS keys.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsEc2Mod.KmsKeyId] = js.undefined
  
  /**
    * The name of the role to use when not using the default role, 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the import snapshot task during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object ImportSnapshotRequest {
  
  inline def apply(): ImportSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSnapshotRequest]
  }
  
  extension [Self <: ImportSnapshotRequest](x: Self) {
    
    inline def setClientData(value: ClientData): Self = StObject.set(x, "ClientData", value.asInstanceOf[js.Any])
    
    inline def setClientDataUndefined: Self = StObject.set(x, "ClientData", js.undefined)
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDiskContainer(value: SnapshotDiskContainer): Self = StObject.set(x, "DiskContainer", value.asInstanceOf[js.Any])
    
    inline def setDiskContainerUndefined: Self = StObject.set(x, "DiskContainer", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setRoleName(value: String): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
