package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ManifestOutputLocation extends StObject {
  
  /**
    * The bucket ARN the generated manifest should be written to.
    */
  var Bucket: S3BucketArnString
  
  /**
    * The Account ID that owns the bucket the generated manifest is written to.
    */
  var ExpectedManifestBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Specifies what encryption should be used when the generated manifest objects are written.
    */
  var ManifestEncryption: js.UndefOr[GeneratedManifestEncryption] = js.undefined
  
  /**
    * The format of the generated manifest.
    */
  var ManifestFormat: GeneratedManifestFormat
  
  /**
    * Prefix identifying one or more objects to which the manifest applies.
    */
  var ManifestPrefix: js.UndefOr[ManifestPrefixString] = js.undefined
}
object S3ManifestOutputLocation {
  
  inline def apply(Bucket: S3BucketArnString, ManifestFormat: GeneratedManifestFormat): S3ManifestOutputLocation = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ManifestFormat = ManifestFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ManifestOutputLocation]
  }
  
  extension [Self <: S3ManifestOutputLocation](x: Self) {
    
    inline def setBucket(value: S3BucketArnString): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedManifestBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedManifestBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedManifestBucketOwnerUndefined: Self = StObject.set(x, "ExpectedManifestBucketOwner", js.undefined)
    
    inline def setManifestEncryption(value: GeneratedManifestEncryption): Self = StObject.set(x, "ManifestEncryption", value.asInstanceOf[js.Any])
    
    inline def setManifestEncryptionUndefined: Self = StObject.set(x, "ManifestEncryption", js.undefined)
    
    inline def setManifestFormat(value: GeneratedManifestFormat): Self = StObject.set(x, "ManifestFormat", value.asInstanceOf[js.Any])
    
    inline def setManifestPrefix(value: ManifestPrefixString): Self = StObject.set(x, "ManifestPrefix", value.asInstanceOf[js.Any])
    
    inline def setManifestPrefixUndefined: Self = StObject.set(x, "ManifestPrefix", js.undefined)
  }
}
