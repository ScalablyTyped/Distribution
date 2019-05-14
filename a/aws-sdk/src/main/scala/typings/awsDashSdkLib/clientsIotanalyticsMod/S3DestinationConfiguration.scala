package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3DestinationConfiguration extends js.Object {
  /**
    * The name of the Amazon S3 bucket to which data set contents are delivered.
    */
  var bucket: BucketName
  /**
    * Configuration information for coordination with the AWS Glue ETL (extract, transform and load) service.
    */
  var glueConfiguration: js.UndefOr[GlueConfiguration] = js.undefined
  /**
    * The key of the data set contents object. Each object in an Amazon S3 bucket has a key that is its unique identifier within the bucket (each object in a bucket has exactly one key).
    */
  var key: BucketKeyExpression
  /**
    * The ARN of the role which grants AWS IoT Analytics permission to interact with your Amazon S3 and AWS Glue resources.
    */
  var roleArn: RoleArn
}

object S3DestinationConfiguration {
  @scala.inline
  def apply(
    bucket: BucketName,
    key: BucketKeyExpression,
    roleArn: RoleArn,
    glueConfiguration: GlueConfiguration = null
  ): S3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(bucket = bucket, key = key, roleArn = roleArn)
    if (glueConfiguration != null) __obj.updateDynamic("glueConfiguration")(glueConfiguration)
    __obj.asInstanceOf[S3DestinationConfiguration]
  }
}

