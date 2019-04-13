package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingJobDefinition extends js.Object {
  /**
    * The hyperparameters used for the training job.
    */
  var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
  /**
    * An array of Channel objects, each of which specifies an input source.
    */
  var InputDataConfig: awsDashSdkLib.clientsSagemakerMod.InputDataConfig
  /**
    * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts.
    */
  var OutputDataConfig: awsDashSdkLib.clientsSagemakerMod.OutputDataConfig
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.
    */
  var ResourceConfig: awsDashSdkLib.clientsSagemakerMod.ResourceConfig
  /**
    * Sets a duration for training. Use this parameter to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms might use this 120-second window to save the model artifacts.
    */
  var StoppingCondition: awsDashSdkLib.clientsSagemakerMod.StoppingCondition
  /**
    * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.
    */
  var TrainingInputMode: awsDashSdkLib.clientsSagemakerMod.TrainingInputMode
}

object TrainingJobDefinition {
  @scala.inline
  def apply(
    InputDataConfig: InputDataConfig,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    StoppingCondition: StoppingCondition,
    TrainingInputMode: TrainingInputMode,
    HyperParameters: HyperParameters = null
  ): TrainingJobDefinition = {
    val __obj = js.Dynamic.literal(InputDataConfig = InputDataConfig, OutputDataConfig = OutputDataConfig, ResourceConfig = ResourceConfig, StoppingCondition = StoppingCondition, TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    if (HyperParameters != null) __obj.updateDynamic("HyperParameters")(HyperParameters)
    __obj.asInstanceOf[TrainingJobDefinition]
  }
}

