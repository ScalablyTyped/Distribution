package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BatchEventTask extends js.Object {
  
  var s3BucketArn: String = js.native
  
  var s3Key: String = js.native
  
  var s3VersionId: String | Null = js.native
  
  var taskId: String = js.native
}
object S3BatchEventTask {
  
  @scala.inline
  def apply(s3BucketArn: String, s3Key: String, taskId: String): S3BatchEventTask = {
    val __obj = js.Dynamic.literal(s3BucketArn = s3BucketArn.asInstanceOf[js.Any], s3Key = s3Key.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchEventTask]
  }
  
  @scala.inline
  implicit class S3BatchEventTaskOps[Self <: S3BatchEventTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3BucketArn(value: String): Self = this.set("s3BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Key(value: String): Self = this.set("s3Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3VersionId(value: String): Self = this.set("s3VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3VersionIdNull: Self = this.set("s3VersionId", null)
  }
}
