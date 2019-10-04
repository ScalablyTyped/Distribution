package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLocationS3Response extends js.Object {
  /**
    * The time that the Amazon S3 bucket location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 bucket location.
    */
  var LocationArn: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationArn] = js.undefined
  /**
    * The URL of the Amazon S3 location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.LocationUri] = js.undefined
  var S3Config: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.S3Config] = js.undefined
  /**
    * The Amazon S3 storage class that you chose to store your files in when this location is used as a task destination. For more information about S3 storage classes, see Amazon S3 Storage Classes in the Amazon Simple Storage Service Developer Guide. Some storage classes have behaviors that can affect your S3 storage cost. For detailed information, see using-storage-classes.
    */
  var S3StorageClass: js.UndefOr[typings.awsDashSdk.clientsDatasyncMod.S3StorageClass] = js.undefined
}

object DescribeLocationS3Response {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    S3Config: S3Config = null,
    S3StorageClass: S3StorageClass = null
  ): DescribeLocationS3Response = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (S3Config != null) __obj.updateDynamic("S3Config")(S3Config)
    if (S3StorageClass != null) __obj.updateDynamic("S3StorageClass")(S3StorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationS3Response]
  }
}

