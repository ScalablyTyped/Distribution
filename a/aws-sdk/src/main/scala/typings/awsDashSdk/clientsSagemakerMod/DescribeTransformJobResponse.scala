package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTransformJobResponse extends js.Object {
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record  is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.  To enable the batch strategy, you must set SplitType to Line, RecordIO, or TFRecord.
    */
  var BatchStrategy: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.BatchStrategy] = js.undefined
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: Timestamp
  var DataProcessing: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DataProcessing] = js.undefined
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
  /**
    * If the transform job failed, FailureReason describes why it failed. A transform job creates a log file, which includes error messages, and stores it as an Amazon S3 object. For more information, see Log Amazon SageMaker Events with Amazon CloudWatch.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or training job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobArn] = js.undefined
  /**
    * The maximum number of parallel requests on each instance node that can be launched in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxConcurrentTransforms] = js.undefined
  /**
    * The maximum payload size, in MB, used in the transform job.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxPayloadInMB] = js.undefined
  /**
    * The name of the model used in the transform job.
    */
  var ModelName: typings.awsDashSdk.clientsSagemakerMod.ModelName
  /**
    * Indicates when the transform job has been completed, or has stopped or failed. You are billed for the time interval between this time and the value of TransformStartTime.
    */
  var TransformEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Describes the dataset to be transformed and the Amazon S3 location where it is stored.
    */
  var TransformInput: typings.awsDashSdk.clientsSagemakerMod.TransformInput
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsDashSdk.clientsSagemakerMod.TransformJobArn
  /**
    * The name of the transform job.
    */
  var TransformJobName: typings.awsDashSdk.clientsSagemakerMod.TransformJobName
  /**
    * The status of the transform job. If the transform job failed, the reason is returned in the FailureReason field.
    */
  var TransformJobStatus: typings.awsDashSdk.clientsSagemakerMod.TransformJobStatus
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TransformOutput] = js.undefined
  /**
    * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
    */
  var TransformResources: typings.awsDashSdk.clientsSagemakerMod.TransformResources
  /**
    * Indicates when the transform job starts on ML instances. You are billed for the time interval between this time and the value of TransformEndTime.
    */
  var TransformStartTime: js.UndefOr[Timestamp] = js.undefined
}

object DescribeTransformJobResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    ModelName: ModelName,
    TransformInput: TransformInput,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus,
    TransformResources: TransformResources,
    BatchStrategy: BatchStrategy = null,
    DataProcessing: DataProcessing = null,
    Environment: TransformEnvironmentMap = null,
    FailureReason: FailureReason = null,
    LabelingJobArn: LabelingJobArn = null,
    MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
    MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
    TransformEndTime: Timestamp = null,
    TransformOutput: TransformOutput = null,
    TransformStartTime: Timestamp = null
  ): DescribeTransformJobResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, ModelName = ModelName, TransformInput = TransformInput, TransformJobArn = TransformJobArn, TransformJobName = TransformJobName, TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any], TransformResources = TransformResources)
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (DataProcessing != null) __obj.updateDynamic("DataProcessing")(DataProcessing)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (LabelingJobArn != null) __obj.updateDynamic("LabelingJobArn")(LabelingJobArn)
    if (!js.isUndefined(MaxConcurrentTransforms)) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms)
    if (!js.isUndefined(MaxPayloadInMB)) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB)
    if (TransformEndTime != null) __obj.updateDynamic("TransformEndTime")(TransformEndTime)
    if (TransformOutput != null) __obj.updateDynamic("TransformOutput")(TransformOutput)
    if (TransformStartTime != null) __obj.updateDynamic("TransformStartTime")(TransformStartTime)
    __obj.asInstanceOf[DescribeTransformJobResponse]
  }
}

