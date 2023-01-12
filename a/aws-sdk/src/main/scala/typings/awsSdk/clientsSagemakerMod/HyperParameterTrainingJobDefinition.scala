package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTrainingJobDefinition extends StObject {
  
  /**
    * The HyperParameterAlgorithmSpecification object that specifies the resource algorithm to use for the training jobs that the tuning job launches.
    */
  var AlgorithmSpecification: HyperParameterAlgorithmSpecification
  
  var CheckpointConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CheckpointConfig] = js.undefined
  
  /**
    * The job definition name.
    */
  var DefinitionName: js.UndefOr[HyperParameterTrainingJobDefinitionName] = js.undefined
  
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean indicating whether managed spot training is enabled (True) or not (False).
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Isolates the training container. No inbound or outbound network calls can be made, except for calls between peers within a training cluster for distributed training. If network isolation is used for training jobs that are configured to use a VPC, SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  var HyperParameterRanges: js.UndefOr[ParameterRanges] = js.undefined
  
  /**
    * The configuration for the hyperparameter tuning resources, including the compute instances and storage volumes, used for training jobs launched by the tuning job. By default, storage volumes hold model artifacts and incremental states. Choose File for TrainingInputMode in the AlgorithmSpecification parameter to additionally store training data in the storage volume (optional).
    */
  var HyperParameterTuningResourceConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameterTuningResourceConfig] = js.undefined
  
  /**
    * An array of Channel objects that specify the input for the training jobs that the tuning job launches.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InputDataConfig] = js.undefined
  
  /**
    * Specifies the path to the Amazon S3 bucket where you store model artifacts from the training jobs that the tuning job launches.
    */
  var OutputDataConfig: typings.awsSdk.clientsSagemakerMod.OutputDataConfig
  
  /**
    * The resources, including the compute instances and storage volumes, to use for the training jobs that the tuning job launches. Storage volumes store model artifacts and incremental states. Training algorithms might also use storage volumes for scratch space. If you want SageMaker to use the storage volume to store the training data, choose File as the TrainingInputMode in the algorithm specification. For distributed training algorithms, specify an instance count greater than 1.  If you want to use hyperparameter optimization with instance type flexibility, use HyperParameterTuningResourceConfig instead. 
    */
  var ResourceConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ResourceConfig] = js.undefined
  
  /**
    * The number of times to retry the job when the job fails due to an InternalServerError.
    */
  var RetryStrategy: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RetryStrategy] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the training jobs that the tuning job launches.
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    * Specifies the values of hyperparameters that do not change for the tuning job.
    */
  var StaticHyperParameters: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * Specifies a limit to how long a model hyperparameter training job can run. It also specifies how long a managed spot training job has to complete. When the job reaches the time limit, SageMaker ends the training job. Use this API to cap model training costs.
    */
  var StoppingCondition: typings.awsSdk.clientsSagemakerMod.StoppingCondition
  
  var TuningObjective: js.UndefOr[HyperParameterTuningJobObjective] = js.undefined
  
  /**
    * The VpcConfig object that specifies the VPC that you want the training jobs that this hyperparameter tuning job launches to connect to. Control access to and from your training container by configuring the VPC. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}
object HyperParameterTrainingJobDefinition {
  
  inline def apply(
    AlgorithmSpecification: HyperParameterAlgorithmSpecification,
    OutputDataConfig: OutputDataConfig,
    RoleArn: RoleArn,
    StoppingCondition: StoppingCondition
  ): HyperParameterTrainingJobDefinition = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StoppingCondition = StoppingCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperParameterTrainingJobDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperParameterTrainingJobDefinition] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmSpecification(value: HyperParameterAlgorithmSpecification): Self = StObject.set(x, "AlgorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfig(value: CheckpointConfig): Self = StObject.set(x, "CheckpointConfig", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigUndefined: Self = StObject.set(x, "CheckpointConfig", js.undefined)
    
    inline def setDefinitionName(value: HyperParameterTrainingJobDefinitionName): Self = StObject.set(x, "DefinitionName", value.asInstanceOf[js.Any])
    
    inline def setDefinitionNameUndefined: Self = StObject.set(x, "DefinitionName", js.undefined)
    
    inline def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    inline def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    inline def setEnableManagedSpotTraining(value: Boolean): Self = StObject.set(x, "EnableManagedSpotTraining", value.asInstanceOf[js.Any])
    
    inline def setEnableManagedSpotTrainingUndefined: Self = StObject.set(x, "EnableManagedSpotTraining", js.undefined)
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setHyperParameterRanges(value: ParameterRanges): Self = StObject.set(x, "HyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterRangesUndefined: Self = StObject.set(x, "HyperParameterRanges", js.undefined)
    
    inline def setHyperParameterTuningResourceConfig(value: HyperParameterTuningResourceConfig): Self = StObject.set(x, "HyperParameterTuningResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningResourceConfigUndefined: Self = StObject.set(x, "HyperParameterTuningResourceConfig", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setInputDataConfigVarargs(value: Channel*): Self = StObject.set(x, "InputDataConfig", js.Array(value*))
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigUndefined: Self = StObject.set(x, "ResourceConfig", js.undefined)
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "RetryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "RetryStrategy", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setStaticHyperParameters(value: HyperParameters): Self = StObject.set(x, "StaticHyperParameters", value.asInstanceOf[js.Any])
    
    inline def setStaticHyperParametersUndefined: Self = StObject.set(x, "StaticHyperParameters", js.undefined)
    
    inline def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setTuningObjective(value: HyperParameterTuningJobObjective): Self = StObject.set(x, "TuningObjective", value.asInstanceOf[js.Any])
    
    inline def setTuningObjectiveUndefined: Self = StObject.set(x, "TuningObjective", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
