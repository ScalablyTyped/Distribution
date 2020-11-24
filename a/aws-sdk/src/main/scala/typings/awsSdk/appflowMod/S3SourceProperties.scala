package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3SourceProperties extends js.Object {
  
  /**
    *  The Amazon S3 bucket name where the source files are stored. 
    */
  var bucketName: BucketName = js.native
  
  /**
    *  The object key for the Amazon S3 bucket in which the source files are stored. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
}
object S3SourceProperties {
  
  @scala.inline
  def apply(bucketName: BucketName): S3SourceProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SourceProperties]
  }
  
  @scala.inline
  implicit class S3SourcePropertiesOps[Self <: S3SourceProperties] (val x: Self) extends AnyVal {
    
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
  }
}
