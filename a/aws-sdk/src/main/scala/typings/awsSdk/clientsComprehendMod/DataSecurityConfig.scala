package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSecurityConfig extends StObject {
  
  /**
    * ID for the KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
    */
  var DataLakeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * ID for the KMS key that Amazon Comprehend uses to encrypt the volume.
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.VpcConfig] = js.undefined
}
object DataSecurityConfig {
  
  inline def apply(): DataSecurityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSecurityConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSecurityConfig] (val x: Self) extends AnyVal {
    
    inline def setDataLakeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "DataLakeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setDataLakeKmsKeyIdUndefined: Self = StObject.set(x, "DataLakeKmsKeyId", js.undefined)
    
    inline def setModelKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "ModelKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setModelKmsKeyIdUndefined: Self = StObject.set(x, "ModelKmsKeyId", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
