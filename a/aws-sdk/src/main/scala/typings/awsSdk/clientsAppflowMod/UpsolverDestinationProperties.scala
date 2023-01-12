package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpsolverDestinationProperties extends StObject {
  
  /**
    *  The Upsolver Amazon S3 bucket name in which Amazon AppFlow places the transferred data. 
    */
  var bucketName: UpsolverBucketName
  
  /**
    *  The object key for the destination Upsolver Amazon S3 bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  /**
    *  The configuration that determines how data is formatted when Upsolver is used as the flow destination. 
    */
  var s3OutputFormatConfig: UpsolverS3OutputFormatConfig
}
object UpsolverDestinationProperties {
  
  inline def apply(bucketName: UpsolverBucketName, s3OutputFormatConfig: UpsolverS3OutputFormatConfig): UpsolverDestinationProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], s3OutputFormatConfig = s3OutputFormatConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsolverDestinationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpsolverDestinationProperties] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: UpsolverBucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setS3OutputFormatConfig(value: UpsolverS3OutputFormatConfig): Self = StObject.set(x, "s3OutputFormatConfig", value.asInstanceOf[js.Any])
  }
}
