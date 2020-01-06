package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformJobDefinition extends js.Object {
  /**
    * A string that determines the number of records included in a single mini-batch.  SingleRecord means only one record is used per mini-batch. MultiRecord means a mini-batch is set to contain as many records that can fit within the MaxPayloadInMB limit.
    */
  var BatchStrategy: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.BatchStrategy] = js.native
  /**
    * The environment variables to set in the Docker container. We support up to 16 key and values entries in the map.
    */
  var Environment: js.UndefOr[TransformEnvironmentMap] = js.native
  /**
    * The maximum number of parallel requests that can be sent to each instance in a transform job. The default value is 1.
    */
  var MaxConcurrentTransforms: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxConcurrentTransforms] = js.native
  /**
    * The maximum payload size allowed, in MB. A payload is the data portion of a record (without metadata).
    */
  var MaxPayloadInMB: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.MaxPayloadInMB] = js.native
  /**
    * A description of the input source and the way the transform job consumes it.
    */
  var TransformInput: typings.awsDashSdk.clientsSagemakerMod.TransformInput = js.native
  /**
    * Identifies the Amazon S3 location where you want Amazon SageMaker to save the results from the transform job.
    */
  var TransformOutput: typings.awsDashSdk.clientsSagemakerMod.TransformOutput = js.native
  /**
    * Identifies the ML compute instances for the transform job.
    */
  var TransformResources: typings.awsDashSdk.clientsSagemakerMod.TransformResources = js.native
}

object TransformJobDefinition {
  @scala.inline
  def apply(
    TransformInput: TransformInput,
    TransformOutput: TransformOutput,
    TransformResources: TransformResources,
    BatchStrategy: BatchStrategy = null,
    Environment: TransformEnvironmentMap = null,
    MaxConcurrentTransforms: Int | Double = null,
    MaxPayloadInMB: Int | Double = null
  ): TransformJobDefinition = {
    val __obj = js.Dynamic.literal(TransformInput = TransformInput.asInstanceOf[js.Any], TransformOutput = TransformOutput.asInstanceOf[js.Any], TransformResources = TransformResources.asInstanceOf[js.Any])
    if (BatchStrategy != null) __obj.updateDynamic("BatchStrategy")(BatchStrategy.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (MaxConcurrentTransforms != null) __obj.updateDynamic("MaxConcurrentTransforms")(MaxConcurrentTransforms.asInstanceOf[js.Any])
    if (MaxPayloadInMB != null) __obj.updateDynamic("MaxPayloadInMB")(MaxPayloadInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobDefinition]
  }
}

