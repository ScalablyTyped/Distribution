package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DestinationProperties extends StObject {
  
  /**
    *  The Amazon S3 bucket name in which Amazon AppFlow places the transferred data. 
    */
  var bucketName: BucketName
  
  /**
    *  The object key for the destination bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  var s3OutputFormatConfig: js.UndefOr[S3OutputFormatConfig] = js.undefined
}
object S3DestinationProperties {
  
  inline def apply(bucketName: BucketName): S3DestinationProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationProperties]
  }
  
  extension [Self <: S3DestinationProperties](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setS3OutputFormatConfig(value: S3OutputFormatConfig): Self = StObject.set(x, "s3OutputFormatConfig", value.asInstanceOf[js.Any])
    
    inline def setS3OutputFormatConfigUndefined: Self = StObject.set(x, "s3OutputFormatConfig", js.undefined)
  }
}
