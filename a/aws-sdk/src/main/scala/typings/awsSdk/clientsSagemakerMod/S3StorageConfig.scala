package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3StorageConfig extends StObject {
  
  /**
    * The Amazon Web Services Key Management Service (KMS) key ID of the key used to encrypt any objects written into the OfflineStore S3 location. The IAM roleARN that is passed as a parameter to CreateFeatureGroup must have below permissions to the KmsKeyId:    "kms:GenerateDataKey"   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The S3 path where offline records are written.
    */
  var ResolvedOutputS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The S3 URI, or location in Amazon S3, of OfflineStore. S3 URIs have a format similar to the following: s3://example-bucket/prefix/.
    */
  var S3Uri: typings.awsSdk.clientsSagemakerMod.S3Uri
}
object S3StorageConfig {
  
  inline def apply(S3Uri: S3Uri): S3StorageConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3StorageConfig]
  }
  
  extension [Self <: S3StorageConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setResolvedOutputS3Uri(value: S3Uri): Self = StObject.set(x, "ResolvedOutputS3Uri", value.asInstanceOf[js.Any])
    
    inline def setResolvedOutputS3UriUndefined: Self = StObject.set(x, "ResolvedOutputS3Uri", js.undefined)
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
