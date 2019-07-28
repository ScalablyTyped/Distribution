package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Action extends js.Object {
  /**
    * The Amazon S3 bucket.
    */
  var bucketName: BucketName
  /**
    * The Amazon S3 canned ACL that controls access to the object identified by the object key. For more information, see S3 canned ACLs.
    */
  var cannedAcl: js.UndefOr[CannedAccessControlList] = js.undefined
  /**
    * The object key.
    */
  var key: Key
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
}

object S3Action {
  @scala.inline
  def apply(bucketName: BucketName, key: Key, roleArn: AwsArn, cannedAcl: CannedAccessControlList = null): S3Action = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, key = key, roleArn = roleArn)
    if (cannedAcl != null) __obj.updateDynamic("cannedAcl")(cannedAcl.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Action]
  }
}

