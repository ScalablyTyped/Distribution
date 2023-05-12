package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExportRequest extends StObject {
  
  /**
    * Start export request s3 bucket.
    */
  var s3Bucket: S3BucketName
  
  /**
    * Start export request s3 bucket owner.
    */
  var s3BucketOwner: js.UndefOr[AccountID] = js.undefined
  
  /**
    * Start export request s3key.
    */
  var s3Key: S3Key
}
object StartExportRequest {
  
  inline def apply(s3Bucket: S3BucketName, s3Key: S3Key): StartExportRequest = {
    val __obj = js.Dynamic.literal(s3Bucket = s3Bucket.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartExportRequest] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3BucketName): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: AccountID): Self = StObject.set(x, "s3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "s3BucketOwner", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
  }
}
