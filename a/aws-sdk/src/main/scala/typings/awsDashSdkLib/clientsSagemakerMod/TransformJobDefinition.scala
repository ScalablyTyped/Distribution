package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformJobDefinition extends js.Object {
  /**
    * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
    */
  var BatchStrategy: js.UndefOr[BatchStrategy] = js.undefined
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.undefined
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined
  /**
    * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
    */
  var MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
  /**
    * A description of the input source and the way the transform job consumes it.
    */
  var TransformInput: awsDashSdkLib.clientsSagemakerMod.TransformInput
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: awsDashSdkLib.clientsSagemakerMod.TransformOutput
  /**
    * Identifies the ML compute instances for the transform job.
    */
  var TransformResources: awsDashSdkLib.clientsSagemakerMod.TransformResources
}

object TransformJobDefinition {
  @scala.inline
  def apply(
    TransformInput: TransformInput,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources,
    BatchStrategy: BatchStrategy = null,
    Environment: TransformEnvironmentMap = null,
    MaxConcurrentTransforms: js.UndefOr[MaxConcurrentTransforms] = js.undefined,
    MaxPayloadInMB: js.UndefOr[MaxPayloadInMB] = js.undefined
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput, TransformOutput = TransformOutput, TransformResources = TransformResources)
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (!js.isUndefined(MaxConcurrentTransforms)) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms)
    if (!js.isUndefined(MaxPayloadInMB)) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB)
    __obj.asInstanceOf[TransformJobDefinition]
  }
}

