package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceS3Location extends StObject {
  
  /**
    * Name of the bucket.
    */
  var bucket: S3Bucket
  
  /**
    * Key of the object.
    */
  var key: S3Key
  
  /**
    * Region of the bucket. Only required for Regions that are disabled by default. For more infomration about Regions that are disabled by default, see  Enabling a Region in the AWS General Reference guide.
    */
  var region: js.UndefOr[S3BucketRegion] = js.undefined
}
object SourceS3Location {
  
  inline def apply(bucket: S3Bucket, key: S3Key): SourceS3Location = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceS3Location]
  }
  
  extension [Self <: SourceS3Location](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: S3BucketRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
