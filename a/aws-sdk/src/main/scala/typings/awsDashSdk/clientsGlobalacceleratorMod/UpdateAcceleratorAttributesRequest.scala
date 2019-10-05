package typings.awsDashSdk.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAcceleratorAttributesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the accelerator that you want to update.
    */
  var AcceleratorArn: GenericString
  /**
    * Update whether flow logs are enabled. The default value is false. If the value is true, FlowLogsS3Bucket and FlowLogsS3Prefix must be specified. For more information, see Flow Logs in the AWS Global Accelerator Developer Guide.
    */
  var FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined
  /**
    * The name of the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. The bucket must exist and have a bucket policy that grants AWS Global Accelerator permission to write to the bucket.
    */
  var FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined
  /**
    * Update the prefix for the location in the Amazon S3 bucket for the flow logs. Attribute is required if FlowLogsEnabled is true. If you don’t specify a prefix, the flow logs are stored in the root of the bucket.
    */
  var FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
}

object UpdateAcceleratorAttributesRequest {
  @scala.inline
  def apply(
    AcceleratorArn: GenericString,
    FlowLogsEnabled: js.UndefOr[Boolean] = js.undefined,
    FlowLogsS3Bucket: GenericString = null,
    FlowLogsS3Prefix: GenericString = null
  ): UpdateAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn)
    if (!js.isUndefined(FlowLogsEnabled)) __obj.updateDynamic("FlowLogsEnabled")(FlowLogsEnabled)
    if (FlowLogsS3Bucket != null) __obj.updateDynamic("FlowLogsS3Bucket")(FlowLogsS3Bucket)
    if (FlowLogsS3Prefix != null) __obj.updateDynamic("FlowLogsS3Prefix")(FlowLogsS3Prefix)
    __obj.asInstanceOf[UpdateAcceleratorAttributesRequest]
  }
}

