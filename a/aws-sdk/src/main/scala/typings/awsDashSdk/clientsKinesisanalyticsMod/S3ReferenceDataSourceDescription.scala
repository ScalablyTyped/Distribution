package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ReferenceDataSourceDescription extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typings.awsDashSdk.clientsKinesisanalyticsMod.BucketARN
  /**
    * Amazon S3 object key name.
    */
  var FileKey: typings.awsDashSdk.clientsKinesisanalyticsMod.FileKey
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.
    */
  var ReferenceRoleARN: RoleARN
}

object S3ReferenceDataSourceDescription {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ReferenceRoleARN: RoleARN): S3ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN, FileKey = FileKey, ReferenceRoleARN = ReferenceRoleARN)
  
    __obj.asInstanceOf[S3ReferenceDataSourceDescription]
  }
}

