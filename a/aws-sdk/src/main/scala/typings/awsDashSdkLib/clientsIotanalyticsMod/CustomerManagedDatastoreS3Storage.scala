package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerManagedDatastoreS3Storage extends js.Object {
  /**
    * The name of the Amazon S3 bucket in which data store data is stored.
    */
  var bucket: BucketName
  /**
    * The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key).
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: RoleArn
}

object CustomerManagedDatastoreS3Storage {
  @scala.inline
  def apply(bucket: BucketName, roleArn: RoleArn, keyPrefix: S3KeyPrefix = null): CustomerManagedDatastoreS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket, roleArn = roleArn)
    if (keyPrefix != null) __obj.updateDynamic("keyPrefix")(keyPrefix)
    __obj.asInstanceOf[CustomerManagedDatastoreS3Storage]
  }
}

