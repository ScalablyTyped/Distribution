package typings.awsSdk.clientsApplicationcostprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * Name of the S3 bucket.
    */
  var bucket: S3Bucket
  
  /**
    * Prefix for the location to write to.
    */
  var prefix: S3Prefix
}
object S3Location {
  
  inline def apply(bucket: S3Bucket, prefix: S3Prefix): S3Location = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
