package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3DestinationProperties extends js.Object {
  
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
  implicit class S3DestinationPropertiesOps[Self <: S3DestinationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
    
    @scala.inline
    def setS3OutputFormatConfig(value: S3OutputFormatConfig): Self = this.set("s3OutputFormatConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3OutputFormatConfig: Self = this.set("s3OutputFormatConfig", js.undefined)
  }
}
