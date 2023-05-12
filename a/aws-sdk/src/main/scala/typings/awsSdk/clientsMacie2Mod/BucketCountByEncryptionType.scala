package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCountByEncryptionType extends StObject {
  
  /**
    *  The total number of buckets whose default encryption settings are configured to encrypt new objects with an Amazon Web Services managed KMS key or a customer managed KMS key. By default, these buckets encrypt new objects automatically using SSE-KMS encryption.
    */
  var kmsManaged: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets whose default encryption settings are configured to encrypt new objects with an Amazon S3 managed key. By default, these buckets encrypt new objects automatically using SSE-S3 encryption.
    */
  var s3Managed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that don't specify default server-side encryption behavior for new objects. Default encryption settings aren't configured for these buckets.
    */
  var unencrypted: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't provide current data about the default encryption settings for these buckets.
    */
  var unknown: js.UndefOr[long] = js.undefined
}
object BucketCountByEncryptionType {
  
  inline def apply(): BucketCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketCountByEncryptionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketCountByEncryptionType] (val x: Self) extends AnyVal {
    
    inline def setKmsManaged(value: long): Self = StObject.set(x, "kmsManaged", value.asInstanceOf[js.Any])
    
    inline def setKmsManagedUndefined: Self = StObject.set(x, "kmsManaged", js.undefined)
    
    inline def setS3Managed(value: long): Self = StObject.set(x, "s3Managed", value.asInstanceOf[js.Any])
    
    inline def setS3ManagedUndefined: Self = StObject.set(x, "s3Managed", js.undefined)
    
    inline def setUnencrypted(value: long): Self = StObject.set(x, "unencrypted", value.asInstanceOf[js.Any])
    
    inline def setUnencryptedUndefined: Self = StObject.set(x, "unencrypted", js.undefined)
    
    inline def setUnknown(value: long): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
