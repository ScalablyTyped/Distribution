package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperParameterTrainingJobDefinition extends js.Object {
  /**
    * The HyperParameterAlgorithmSpecification object that specifies the resource algorithm to use for the training jobs that the tuning job launches.
    */
  var AlgorithmSpecification: HyperParameterAlgorithmSpecification
  var CheckpointConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CheckpointConfig] = js.undefined
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean indicating whether managed spot training is enabled (True) or not (False).
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined
  /**
    * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.  The Semantic Segmentation built-in algorithm does not support network isolation. 
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of Channel objects that specify the input for the training jobs that the tuning job launches.
    */
  var InputDataConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InputDataConfig] = js.undefined
  /**
    * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning job launches.
    */
  var OutputDataConfig: typings.awsDashSdk.clientsSagemakerMod.OutputDataConfig
  /**
    * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning job launches. Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes for scratch space. If you want Amazon SageMaker to use the storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.
    */
  var ResourceConfig: typings.awsDashSdk.clientsSagemakerMod.ResourceConfig
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
    */
  var RoleArn: typings.awsDashSdk.clientsSagemakerMod.RoleArn
  /**
    * Specifies the values of hyperparameters that do not change for the tuning job.
    */
  var StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined
  /**
    * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long you are willing to wait for a managed spot training job to complete. When the job reaches the a limit, Amazon SageMaker ends the training job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsDashSdk.clientsSagemakerMod.StoppingCondition
  /**
    * The VpcConfig object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}

object HyperParameterTrainingJobDefinition {
  @scala.inline
  def apply(
    AlgorithmSpecification: HyperParameterAlgorithmSpecification,
    OutputDataConfig: OutputDataConfig,
    ResourceConfig: ResourceConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition,
    CheckpointConfig: CheckpointConfig = null,
    EnableInterContainerTrafficEncryption: js.UndefOr[scala.Boolean] = js.undefined,
    EnableManagedSpotTraining: js.UndefOr[scala.Boolean] = js.undefined,
    EnableNetworkIsolation: js.UndefOr[scala.Boolean] = js.undefined,
    InputDataConfig: InputDataConfig = null,
    StaticHyperParameters: HyperParameters = null,
    VpcConfig: VpcConfig = null
  ): HyperParameterTrainingJobDefinition = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification, OutputDataConfig = OutputDataConfig, ResourceConfig = ResourceConfig, RoleArn = RoleArn, StoppingCondition = StoppingCondition)
    if (CheckpointConfig != null) __obj.updateDynamic("CheckpointConfig")(CheckpointConfig)
    if (!js.isUndefined(EnableInterContainerTrafficEncryption)) __obj.updateDynamic("EnableInterContainerTrafficEncryption")(EnableInterContainerTrafficEncryption)
    if (!js.isUndefined(EnableManagedSpotTraining)) __obj.updateDynamic("EnableManagedSpotTraining")(EnableManagedSpotTraining)
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (StaticHyperParameters != null) __obj.updateDynamic("StaticHyperParameters")(StaticHyperParameters)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
  }
}

