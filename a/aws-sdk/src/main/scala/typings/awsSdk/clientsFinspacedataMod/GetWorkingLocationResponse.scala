package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkingLocationResponse extends StObject {
  
  /**
    * Returns the Amazon S3 bucket name for the working location.
    */
  var s3Bucket: js.UndefOr[stringValueLength1to63] = js.undefined
  
  /**
    * Returns the Amazon S3 Path for the working location.
    */
  var s3Path: js.UndefOr[stringValueLength1to1024] = js.undefined
  
  /**
    * Returns the Amazon S3 URI for the working location.
    */
  var s3Uri: js.UndefOr[stringValueLength1to1024] = js.undefined
}
object GetWorkingLocationResponse {
  
  inline def apply(): GetWorkingLocationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkingLocationResponse]
  }
  
  extension [Self <: GetWorkingLocationResponse](x: Self) {
    
    inline def setS3Bucket(value: stringValueLength1to63): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Path(value: stringValueLength1to1024): Self = StObject.set(x, "s3Path", value.asInstanceOf[js.Any])
    
    inline def setS3PathUndefined: Self = StObject.set(x, "s3Path", js.undefined)
    
    inline def setS3Uri(value: stringValueLength1to1024): Self = StObject.set(x, "s3Uri", value.asInstanceOf[js.Any])
    
    inline def setS3UriUndefined: Self = StObject.set(x, "s3Uri", js.undefined)
  }
}
