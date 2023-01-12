package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Object extends StObject {
  
  /**
    * The name of the specific S3 bucket. 
    */
  var Bucket: S3Bucket
  
  /**
    * The AWS Key Management Service (AWS KMS) key being used to encrypt the S3 object. Without this key, data in the bucket is not accessible. 
    */
  var Key: S3Key
}
object S3Object {
  
  inline def apply(Bucket: S3Bucket, Key: S3Key): S3Object = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Object]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Object] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
