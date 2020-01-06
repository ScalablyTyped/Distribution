package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrainingJobDefinition extends js.Object {
  /**
    * The hyperparameters used for the training job.
    */
  var HyperParameters: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.HyperParameters] = js.native
  /**
    * An array of Channel objects, each of which specifies an input source.
    */
  var InputDataConfig: typings.awsDashSdk.clientsSagemakerMod.InputDataConfig = js.native
  /**
    * the path to the S3 bucket where you want to store model artifacts. Amazon SageMaker creates subfolders for the artifacts.
    */
  var OutputDataConfig: typings.awsDashSdk.clientsSagemakerMod.OutputDataConfig = js.native
  /**
    * The resources, including the ML compute instances and ML storage volumes, to use for model training.
    */
  var ResourceConfig: typings.awsDashSdk.clientsSagemakerMod.ResourceConfig = js.native
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts.
    */
  var StoppingCondition: typings.awsDashSdk.clientsSagemakerMod.StoppingCondition = js.native
  /**
    * The input mode used by the algorithm for the training job. For the input modes that Amazon SageMaker algorithms support, see Algorithms. If an algorithm supports the File input mode, Amazon SageMaker downloads the training data from S3 to the provisioned ML storage Volume, and mounts the directory to docker volume for training container. If an algorithm supports the Pipe input mode, Amazon SageMaker streams data directly from S3 to the container.
    */
  var TrainingInputMode: typings.awsDashSdk.clientsSagemakerMod.TrainingInputMode = js.native
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
    val __obj = js.Dynamic.literal(InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], ResourceConfig = ResourceConfig.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any], TrainingInputMode = TrainingInputMode.asInstanceOf[js.Any])
    if (HyperParameters != null) __obj.updateDynamic("HyperParameters")(HyperParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingJobDefinition]
  }
}

