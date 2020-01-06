package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackDetail extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the conformance pack.
    */
  var ConformancePackArn: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackArn = js.native
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackId = js.native
  /**
    * A list of ConformancePackInputParameter objects.
    */
  var ConformancePackInputParameters: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConformancePackInputParameters] = js.native
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackName = js.native
  /**
    * AWS service that created the conformance pack.
    */
  var CreatedBy: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * Conformance pack template that is used to create a pack. The delivery bucket name should start with awsconfigconforms. For example: "Resource": "arn:aws:s3:::your_bucket_name/ *".
    */
  var DeliveryS3Bucket: typings.awsDashSdk.clientsConfigserviceMod.DeliveryS3Bucket = js.native
  /**
    * The prefix for the Amazon S3 bucket.
    */
  var DeliveryS3KeyPrefix: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.DeliveryS3KeyPrefix] = js.native
  /**
    * Last time when conformation pack update was requested. 
    */
  var LastUpdateRequestedTime: js.UndefOr[_Date] = js.native
}

object ConformancePackDetail {
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    DeliveryS3Bucket: DeliveryS3Bucket,
    ConformancePackInputParameters: ConformancePackInputParameters = null,
    CreatedBy: StringWithCharLimit256 = null,
    DeliveryS3KeyPrefix: DeliveryS3KeyPrefix = null,
    LastUpdateRequestedTime: _Date = null
  ): ConformancePackDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], DeliveryS3Bucket = DeliveryS3Bucket.asInstanceOf[js.Any])
    if (ConformancePackInputParameters != null) __obj.updateDynamic("ConformancePackInputParameters")(ConformancePackInputParameters.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (DeliveryS3KeyPrefix != null) __obj.updateDynamic("DeliveryS3KeyPrefix")(DeliveryS3KeyPrefix.asInstanceOf[js.Any])
    if (LastUpdateRequestedTime != null) __obj.updateDynamic("LastUpdateRequestedTime")(LastUpdateRequestedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackDetail]
  }
}

