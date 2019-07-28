package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Configuration extends js.Object {
  /**
    * ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typings.awsDashSdk.clientsKinesisanalyticsMod.BucketARN
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typings.awsDashSdk.clientsKinesisanalyticsMod.FileKey
  /**
    * IAM ARN of the role used to access the data.
    */
  var RoleARN: typings.awsDashSdk.clientsKinesisanalyticsMod.RoleARN
}

object S3Configuration {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, RoleARN: RoleARN): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN, FileKey = FileKey, RoleARN = RoleARN)
  
    __obj.asInstanceOf[S3Configuration]
  }
}

