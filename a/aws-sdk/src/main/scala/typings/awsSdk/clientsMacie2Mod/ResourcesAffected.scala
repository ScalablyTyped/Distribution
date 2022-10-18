package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourcesAffected extends StObject {
  
  /**
    * The details of the S3 bucket that the finding applies to.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * The details of the S3 object that the finding applies to.
    */
  var s3Object: js.UndefOr[S3Object] = js.undefined
}
object ResourcesAffected {
  
  inline def apply(): ResourcesAffected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesAffected]
  }
  
  extension [Self <: ResourcesAffected](x: Self) {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setS3Object(value: S3Object): Self = StObject.set(x, "s3Object", value.asInstanceOf[js.Any])
    
    inline def setS3ObjectUndefined: Self = StObject.set(x, "s3Object", js.undefined)
  }
}
