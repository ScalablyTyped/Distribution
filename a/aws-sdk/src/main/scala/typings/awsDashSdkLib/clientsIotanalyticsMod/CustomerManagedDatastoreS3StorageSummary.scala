package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerManagedDatastoreS3StorageSummary extends js.Object {
  /**
    * The name of the Amazon S3 bucket in which data store data is stored.
    */
  var bucket: js.UndefOr[BucketName] = js.undefined
  /**
    * The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key).
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
}

object CustomerManagedDatastoreS3StorageSummary {
  @scala.inline
  def apply(bucket: BucketName = null, keyPrefix: S3KeyPrefix = null, roleArn: RoleArn = null): CustomerManagedDatastoreS3StorageSummary = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket)
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    __obj.asInstanceOf[CustomerManagedDatastoreS3StorageSummary]
  }
}

