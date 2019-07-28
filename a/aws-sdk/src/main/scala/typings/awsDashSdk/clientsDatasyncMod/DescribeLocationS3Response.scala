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
}

object DescribeLocationS3Response {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    S3Config: S3Config = null
  ): DescribeLocationS3Response = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn)
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri)
    if (S3Config != null) __obj.updateDynamic("S3Config")(S3Config)
    __obj.asInstanceOf[DescribeLocationS3Response]
  }
}

