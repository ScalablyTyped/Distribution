package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRoleRequest extends js.Object {
  /**
    * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
    */
  var InputBucket: BucketName
  /**
    * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from this bucket.
    */
  var OutputBucket: BucketName
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
    */
  var Role: typings.awsDashSdk.clientsElastictranscoderMod.Role
  /**
    * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a test notification to.
    */
  var Topics: SnsTopics
}

object TestRoleRequest {
  @scala.inline
  def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
    val __obj = js.Dynamic.literal(InputBucket = InputBucket, OutputBucket = OutputBucket, Role = Role, Topics = Topics)
  
    __obj.asInstanceOf[TestRoleRequest]
  }
}

