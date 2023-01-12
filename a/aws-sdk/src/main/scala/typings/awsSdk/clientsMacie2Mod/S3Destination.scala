package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * The name of the bucket.
    */
  var bucketName: string
  
  /**
    * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store classification results in the bucket.
    */
  var keyPrefix: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the customer managed KMS key to use for encryption of the results. This must be the ARN of an existing, symmetric encryption KMS key that's in the same Amazon Web Services Region as the bucket.
    */
  var kmsKeyArn: string
}
object S3Destination {
  
  inline def apply(bucketName: string, kmsKeyArn: string): S3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Destination] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: string): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefix(value: string): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setKmsKeyArn(value: string): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
  }
}
