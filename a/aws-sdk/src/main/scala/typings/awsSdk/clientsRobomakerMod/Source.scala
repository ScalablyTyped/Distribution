package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * The taget processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  
  /**
    * A hash of the object specified by s3Bucket and s3Key.
    */
  var etag: js.UndefOr[S3Etag] = js.undefined
  
  /**
    * The s3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setArchitecture(value: Architecture): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setEtag(value: S3Etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "s3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "s3Key", js.undefined)
  }
}
