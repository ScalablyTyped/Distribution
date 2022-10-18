package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketServerSideEncryption extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) or unique identifier (key ID) for the KMS key that's used by default to encrypt objects that are added to the bucket. This value is null if the bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new objects by default.
    */
  var kmsMasterKeyId: js.UndefOr[string] = js.undefined
  
  /**
    * The type of server-side encryption that's used by default when storing new objects in the bucket. Possible values are: AES256 - New objects are encrypted with an Amazon S3 managed key. They use SSE-S3 encryption. aws:kms - New objects are encrypted with an KMS key (kmsMasterKeyId), either an Amazon Web Services managed key or a customer managed key. They use SSE-KMS encryption. NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}
object BucketServerSideEncryption {
  
  inline def apply(): BucketServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketServerSideEncryption]
  }
  
  extension [Self <: BucketServerSideEncryption](x: Self) {
    
    inline def setKmsMasterKeyId(value: string): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
