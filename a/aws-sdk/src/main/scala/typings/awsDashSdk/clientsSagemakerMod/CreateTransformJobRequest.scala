package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransformJobRequest extends js.Object {
  /**
    * Specifies the number of records to include in a mini-batch for an HTTP inference request. A record  is a single unit of input data that inference can be made on. For example, a single line in a CSV file is a record.  To enable the batch strategy, you must set SplitType to Line, RecordIO, or TFRecord. To use only one record when making an HTTP invocation request to a container, set BatchStrategy to SingleRecord and SplitType to Line. To fit as many records in a mini-batch as can fit within the MaxPayloadInMB limit, set BatchStrategy to MultiRecord and SplitType to Line.
    */
  var BatchStrategy: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.BatchStrategy] = js.undefined
  /**
    * The data structure used to specify the data to be used for inference in a batch transform job and to associate the data that is relevant to the prediction results in the output. The input filter provided allows you to exclude input data that is not needed for inference in a batch transform job. The output filter provided allows you to include input data relevant to interpreting the predictions in the output from the job. For more information, see Associate Prediction Results with their Corresponding Input Records.
    */
  var DataProcessing: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.DataProcessing] = js.undefined
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. If MaxConcurrentTransforms is set to 0 or left unset, Amazon SageMaker checks the optional execution-parameters to determine the optimal settings for your chosen algorithm. If the execution-parameters endpoint is not enabled, the default value is 1. For more information on execution-parameters, see How Containers Serve Requests. For built-in algorithms, you don't need to set a value for MaxConcurrentTransforms.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxConcurrentTransforms] = js.undefined
  /**
    * The maximum allowed size of the payload, in MB. A payload is the data portion of a record (without metadata). The value in MaxPayloadInMB must be greater than, or equal to, the size of a single record. To estimate the size of a record in MB, divide the size of your dataset by the number of records. To ensure that the records fit within the maximum payload size, we recommend using a slightly larger value. The default value is 6 MB.  For cases where the payload might be arbitrarily large and is transmitted using HTTP chunked encoding, set the value to 0. This feature works only in supported algorithms. Currently, Amazon SageMaker built-in algorithms do not support HTTP chunked encoding.
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxPayloadInMB] = js.undefined
  /**
    * The name of the model that you want to use for the transform job. ModelName must be the name of an existing Amazon SageMaker model within an AWS Region in an AWS account.
    */
  var ModelName: typings.awsDashSdk.clientsSagemakerMod.ModelName
  /**
    * (Optional) An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * Describes the input source and the way the transform job consumes it.
    */
  var TransformInput: typings.awsDashSdk.clientsSagemakerMod.TransformInput
  /**
    * The name of the transform job. The name must be unique within an AWS Region in an AWS account. 
    */
  var TransformJobName: typings.awsDashSdk.clientsSagemakerMod.TransformJobName
  /**
    * Describes the results of the transform job.
    */
  var TransformOutput: typings.awsDashSdk.clientsSagemakerMod.TransformOutput
  /**
    * Describes the resources, including ML instance types and ML instance count, to use for the transform job.
    */
  var TransformResources: typings.awsDashSdk.clientsSagemakerMod.TransformResources
}

object CreateTransformJobRequest {
  @scala.inline
  def apply(
    ModelName: ModelName,
    TransformInput: TransformInput,
    TransformJobName: TransformJobName,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources,
    BatchStrategy: BatchStrategy = null,
    DataProcessing: DataProcessing = null,
    Environment: TransformEnvironmentMap = null,
    MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
    MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined,
    Tags: TagList = null
  ): CreateTransformJobRequest = {
    val __obj = js.Dynamic.literal(ModelName = ModelName, TransformInput = TransformInput, TransformJobName = TransformJobName, TransformOutput = TransformOutput, TransformResources = TransformResources)
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (DataProcessing != null) __obj.updateDynamic("DataProcessing")(DataProcessing)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (!js.isUndefined(MaxConcurrentTransforms)) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms)
    if (!js.isUndefined(MaxPayloadInMB)) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateTransformJobRequest]
  }
}

