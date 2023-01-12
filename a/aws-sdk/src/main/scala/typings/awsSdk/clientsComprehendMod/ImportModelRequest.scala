package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportModelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Management (IAM) role that allows Amazon Comprehend to use Amazon Key Management Service (KMS) to encrypt or decrypt the custom model.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The name to assign to the custom model that is created in Amazon Comprehend by this import.
    */
  var ModelName: js.UndefOr[ComprehendArnName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the custom model to import.
    */
  var SourceModelArn: ComprehendModelArn
  
  /**
    * Tags to be associated with the custom model that is created by this import. A tag is a key-value pair that adds as a metadata to a resource used by Amazon Comprehend. For example, a tag with "Sales" as the key might be added to a resource to indicate its use by the sales department.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The version name given to the custom model that is created by this import. Version names can have a maximum of 256 characters. Alphanumeric characters, hyphens (-) and underscores (_) are allowed. The version name must be unique among all models with the same classifier name in the account/AWS Region.
    */
  var VersionName: js.UndefOr[typings.awsSdk.clientsComprehendMod.VersionName] = js.undefined
}
object ImportModelRequest {
  
  inline def apply(SourceModelArn: ComprehendModelArn): ImportModelRequest = {
    val __obj = js.Dynamic.literal(SourceModelArn = SourceModelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportModelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportModelRequest] (val x: Self) extends AnyVal {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setModelKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "ModelKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setModelKmsKeyIdUndefined: Self = StObject.set(x, "ModelKmsKeyId", js.undefined)
    
    inline def setModelName(value: ComprehendArnName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setSourceModelArn(value: ComprehendModelArn): Self = StObject.set(x, "SourceModelArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVersionName(value: VersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
  }
}
