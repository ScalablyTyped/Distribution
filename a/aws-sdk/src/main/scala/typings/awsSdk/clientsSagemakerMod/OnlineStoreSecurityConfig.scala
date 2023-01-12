package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlineStoreSecurityConfig extends StObject {
  
  /**
    * The ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker Feature Store uses to encrypt the Amazon S3 objects at rest using Amazon S3 server-side encryption. The caller (either IAM user or IAM role) of CreateFeatureGroup must have below permissions to the OnlineStore KmsKeyId:    "kms:Encrypt"     "kms:Decrypt"     "kms:DescribeKey"     "kms:CreateGrant"     "kms:RetireGrant"     "kms:ReEncryptFrom"     "kms:ReEncryptTo"     "kms:GenerateDataKey"     "kms:ListAliases"     "kms:ListGrants"     "kms:RevokeGrant"    The caller (either IAM user or IAM role) to all DataPlane operations (PutRecord, GetRecord, DeleteRecord) must have the following permissions to the KmsKeyId:    "kms:Decrypt"   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
}
object OnlineStoreSecurityConfig {
  
  inline def apply(): OnlineStoreSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlineStoreSecurityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnlineStoreSecurityConfig] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
