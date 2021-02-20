package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3DestinationProperties extends StObject {
  
  /**
    *  The Amazon S3 bucket name in which Amazon AppFlow places the transferred data. 
    */
  var bucketName: BucketName = js.native
  
  /**
    *  The object key for the destination bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
  
  var s3OutputFormatConfig: js.UndefOr[S3OutputFormatConfig] = js.native
}
object S3DestinationProperties {
  
  @scala.inline
  def apply(bucketName: BucketName): S3DestinationProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DestinationProperties]
  }
  
  @scala.inline
  implicit class S3DestinationPropertiesMutableBuilder[Self <: S3DestinationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    @scala.inline
    def setS3OutputFormatConfig(value: S3OutputFormatConfig): Self = StObject.set(x, "s3OutputFormatConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3OutputFormatConfigUndefined: Self = StObject.set(x, "s3OutputFormatConfig", js.undefined)
  }
}
