package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    *  The name of the S3 bucket.
    */
  var bucket: S3BucketName
  
  /**
    *  The path of the folder, within the S3 bucket that contains the Dataset.
    */
  var key: S3Key
}
object S3Location {
  
  inline def apply(bucket: S3BucketName, key: S3Key): S3Location = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKey(value: S3Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
