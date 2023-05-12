package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketSource extends StObject {
  
  /**
    * S3 bucket source s3 bucket.
    */
  var s3Bucket: S3BucketName
  
  /**
    * S3 bucket source s3 bucket owner.
    */
  var s3BucketOwner: js.UndefOr[AccountID] = js.undefined
  
  /**
    * S3 bucket source s3 key.
    */
  var s3Key: S3Key
}
object S3BucketSource {
  
  inline def apply(s3Bucket: S3BucketName, s3Key: S3Key): S3BucketSource = {
    val __obj = js.Dynamic.literal(s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BucketSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketSource] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3BucketName): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: AccountID): Self = StObject.set(x, "s3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "s3BucketOwner", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
  }
}
