package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Object extends StObject {
  
  /**
    *  The S3 bucket name. 
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    *  The Amazon S3 key name. 
    */
  var s3key: js.UndefOr[S3Key] = js.undefined
}
object S3Object {
  
  inline def apply(): S3Object = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Object]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Object] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3key(value: S3Key): Self = StObject.set(x, "s3key", value.asInstanceOf[js.Any])
    
    inline def setS3keyUndefined: Self = StObject.set(x, "s3key", js.undefined)
  }
}
