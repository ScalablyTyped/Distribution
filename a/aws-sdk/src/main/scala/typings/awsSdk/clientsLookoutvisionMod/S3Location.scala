package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The S3 bucket that contains the training or model packaging job output. If you are training a model, the bucket must in your AWS account. If you use an S3 bucket for a model packaging job, the S3 bucket must be in the same AWS Region and AWS account in which you use AWS IoT Greengrass.
    */
  var Bucket: S3BucketName
  
  /**
    * The path of the folder, within the S3 bucket, that contains the output.
    */
  var Prefix: js.UndefOr[S3KeyPrefix] = js.undefined
}
object S3Location {
  
  inline def apply(Bucket: S3BucketName): S3Location = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  extension [Self <: S3Location](x: Self) {
    
    inline def setBucket(value: S3BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3KeyPrefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
