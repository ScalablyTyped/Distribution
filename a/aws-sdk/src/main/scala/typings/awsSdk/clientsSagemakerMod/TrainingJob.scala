package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingJob extends StObject {
  
  /**
    * Information about the algorithm used for training, and algorithm metadata.
    */
  var AlgorithmSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AlgorithmSpecification] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var AutoMLJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AutoMLJobArn] = js.undefined
  
  /**
    * The billable time in seconds.
    */
  var BillableTimeInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.BillableTimeInSeconds] = js.undefined
  
  var CheckpointConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CheckpointConfig] = js.undefined
  
  /**
    * A timestamp that indicates when the training job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var DebugHookConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DebugHookConfig] = js.undefined
  
  /**
    * Information about the debug rule configuration.
    */
  var DebugRuleConfigurations: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DebugRuleConfigurations] = js.undefined
  
  /**
    * Information about the evaluation status of the rules for the training job.
    */
  var DebugRuleEvaluationStatuses: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DebugRuleEvaluationStatuses] = js.undefined
  
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, enables managed spot training using Amazon EC2 Spot instances to run training jobs instead of on-demand instances. For more information, see Managed Spot Training.
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the TrainingJob was created with network isolation, the value is set to true. If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The environment variables to set in the Docker container.
    */
  var Environment: js.UndefOr[TrainingEnvironmentMap] = js.undefined
  
  var ExperimentConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExperimentConfig] = js.undefined
  
  /**
    * If the training job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * A list of final metric values that are set when the training job completes. Used only if the training job was configured to use metrics.
    */
  var FinalMetricDataList: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FinalMetricDataList] = js.undefined
  
  /**
    * Algorithm-specific parameters.
    */
  var HyperParameters: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameters] = js.undefined
  
  /**
    * An array of Channel objects that describes each data input channel.
    */
  var InputDataConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InputDataConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LabelingJobArn] = js.undefined
  
  /**
    * A timestamp that indicates when the status of the training job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the Amazon S3 location that is configured for storing model artifacts.
    */
  var ModelArtifacts: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelArtifacts] = js.undefined
  
  /**
    * The S3 path where model artifacts that you configured when creating the job are stored. SageMaker creates subfolders for model artifacts.
    */
  var OutputDataConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.OutputDataConfig] = js.undefined
  
  /**
    * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
    */
  var ResourceConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ResourceConfig] = js.undefined
  
  /**
    * The number of times to retry the job when the job fails due to an InternalServerError.
    */
  var RetryStrategy: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RetryStrategy] = js.undefined
  
  /**
    * The Amazon Web Services Identity and Access Management (IAM) role configured for the training job.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    *  Provides detailed information about the state of the training job. For detailed information about the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
    */
  var SecondaryStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SecondaryStatus] = js.undefined
  
  /**
    * A history of all of the secondary statuses that the training job has transitioned through.
    */
  var SecondaryStatusTransitions: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SecondaryStatusTransitions] = js.undefined
  
  /**
    * Specifies a limit to how long a model training job can run. It also specifies how long a managed Spot training job has to complete. When the job reaches the time limit, SageMaker ends the training job. Use this API to cap model training costs. To stop a job, SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: js.UndefOr[typings.awsSdk.clientsSagemakerMod.StoppingCondition] = js.undefined
  
  /**
    * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. For more information, see Tagging Amazon Web Services Resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  var TensorBoardOutputConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TensorBoardOutputConfig] = js.undefined
  
  /**
    * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingJobArn] = js.undefined
  
  /**
    * The name of the training job.
    */
  var TrainingJobName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingJobName] = js.undefined
  
  /**
    * The status of the training job. Training job statuses are:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
    */
  var TrainingJobStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingJobStatus] = js.undefined
  
  /**
    * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The training time in seconds.
    */
  var TrainingTimeInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TrainingTimeInSeconds] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
    */
  var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined
  
  /**
    * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}
object TrainingJob {
  
  inline def apply(): TrainingJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrainingJob] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmSpecification(value: AlgorithmSpecification): Self = StObject.set(x, "AlgorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmSpecificationUndefined: Self = StObject.set(x, "AlgorithmSpecification", js.undefined)
    
    inline def setAutoMLJobArn(value: AutoMLJobArn): Self = StObject.set(x, "AutoMLJobArn", value.asInstanceOf[js.Any])
    
    inline def setAutoMLJobArnUndefined: Self = StObject.set(x, "AutoMLJobArn", js.undefined)
    
    inline def setBillableTimeInSeconds(value: BillableTimeInSeconds): Self = StObject.set(x, "BillableTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setBillableTimeInSecondsUndefined: Self = StObject.set(x, "BillableTimeInSeconds", js.undefined)
    
    inline def setCheckpointConfig(value: CheckpointConfig): Self = StObject.set(x, "CheckpointConfig", value.asInstanceOf[js.Any])
    
    inline def setCheckpointConfigUndefined: Self = StObject.set(x, "CheckpointConfig", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDebugHookConfig(value: DebugHookConfig): Self = StObject.set(x, "DebugHookConfig", value.asInstanceOf[js.Any])
    
    inline def setDebugHookConfigUndefined: Self = StObject.set(x, "DebugHookConfig", js.undefined)
    
    inline def setDebugRuleConfigurations(value: DebugRuleConfigurations): Self = StObject.set(x, "DebugRuleConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDebugRuleConfigurationsUndefined: Self = StObject.set(x, "DebugRuleConfigurations", js.undefined)
    
    inline def setDebugRuleConfigurationsVarargs(value: DebugRuleConfiguration*): Self = StObject.set(x, "DebugRuleConfigurations", js.Array(value*))
    
    inline def setDebugRuleEvaluationStatuses(value: DebugRuleEvaluationStatuses): Self = StObject.set(x, "DebugRuleEvaluationStatuses", value.asInstanceOf[js.Any])
    
    inline def setDebugRuleEvaluationStatusesUndefined: Self = StObject.set(x, "DebugRuleEvaluationStatuses", js.undefined)
    
    inline def setDebugRuleEvaluationStatusesVarargs(value: DebugRuleEvaluationStatus*): Self = StObject.set(x, "DebugRuleEvaluationStatuses", js.Array(value*))
    
    inline def setEnableInterContainerTrafficEncryption(value: Boolean): Self = StObject.set(x, "EnableInterContainerTrafficEncryption", value.asInstanceOf[js.Any])
    
    inline def setEnableInterContainerTrafficEncryptionUndefined: Self = StObject.set(x, "EnableInterContainerTrafficEncryption", js.undefined)
    
    inline def setEnableManagedSpotTraining(value: Boolean): Self = StObject.set(x, "EnableManagedSpotTraining", value.asInstanceOf[js.Any])
    
    inline def setEnableManagedSpotTrainingUndefined: Self = StObject.set(x, "EnableManagedSpotTraining", js.undefined)
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setEnvironment(value: TrainingEnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setExperimentConfig(value: ExperimentConfig): Self = StObject.set(x, "ExperimentConfig", value.asInstanceOf[js.Any])
    
    inline def setExperimentConfigUndefined: Self = StObject.set(x, "ExperimentConfig", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFinalMetricDataList(value: FinalMetricDataList): Self = StObject.set(x, "FinalMetricDataList", value.asInstanceOf[js.Any])
    
    inline def setFinalMetricDataListUndefined: Self = StObject.set(x, "FinalMetricDataList", js.undefined)
    
    inline def setFinalMetricDataListVarargs(value: MetricData*): Self = StObject.set(x, "FinalMetricDataList", js.Array(value*))
    
    inline def setHyperParameters(value: HyperParameters): Self = StObject.set(x, "HyperParameters", value.asInstanceOf[js.Any])
    
    inline def setHyperParametersUndefined: Self = StObject.set(x, "HyperParameters", js.undefined)
    
    inline def setInputDataConfig(value: InputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setInputDataConfigVarargs(value: Channel*): Self = StObject.set(x, "InputDataConfig", js.Array(value*))
    
    inline def setLabelingJobArn(value: LabelingJobArn): Self = StObject.set(x, "LabelingJobArn", value.asInstanceOf[js.Any])
    
    inline def setLabelingJobArnUndefined: Self = StObject.set(x, "LabelingJobArn", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelArtifacts(value: ModelArtifacts): Self = StObject.set(x, "ModelArtifacts", value.asInstanceOf[js.Any])
    
    inline def setModelArtifactsUndefined: Self = StObject.set(x, "ModelArtifacts", js.undefined)
    
    inline def setOutputDataConfig(value: OutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setResourceConfig(value: ResourceConfig): Self = StObject.set(x, "ResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setResourceConfigUndefined: Self = StObject.set(x, "ResourceConfig", js.undefined)
    
    inline def setRetryStrategy(value: RetryStrategy): Self = StObject.set(x, "RetryStrategy", value.asInstanceOf[js.Any])
    
    inline def setRetryStrategyUndefined: Self = StObject.set(x, "RetryStrategy", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSecondaryStatus(value: SecondaryStatus): Self = StObject.set(x, "SecondaryStatus", value.asInstanceOf[js.Any])
    
    inline def setSecondaryStatusTransitions(value: SecondaryStatusTransitions): Self = StObject.set(x, "SecondaryStatusTransitions", value.asInstanceOf[js.Any])
    
    inline def setSecondaryStatusTransitionsUndefined: Self = StObject.set(x, "SecondaryStatusTransitions", js.undefined)
    
    inline def setSecondaryStatusTransitionsVarargs(value: SecondaryStatusTransition*): Self = StObject.set(x, "SecondaryStatusTransitions", js.Array(value*))
    
    inline def setSecondaryStatusUndefined: Self = StObject.set(x, "SecondaryStatus", js.undefined)
    
    inline def setStoppingCondition(value: StoppingCondition): Self = StObject.set(x, "StoppingCondition", value.asInstanceOf[js.Any])
    
    inline def setStoppingConditionUndefined: Self = StObject.set(x, "StoppingCondition", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTensorBoardOutputConfig(value: TensorBoardOutputConfig): Self = StObject.set(x, "TensorBoardOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setTensorBoardOutputConfigUndefined: Self = StObject.set(x, "TensorBoardOutputConfig", js.undefined)
    
    inline def setTrainingEndTime(value: js.Date): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    inline def setTrainingJobArn(value: TrainingJobArn): Self = StObject.set(x, "TrainingJobArn", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobArnUndefined: Self = StObject.set(x, "TrainingJobArn", js.undefined)
    
    inline def setTrainingJobName(value: TrainingJobName): Self = StObject.set(x, "TrainingJobName", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobNameUndefined: Self = StObject.set(x, "TrainingJobName", js.undefined)
    
    inline def setTrainingJobStatus(value: TrainingJobStatus): Self = StObject.set(x, "TrainingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobStatusUndefined: Self = StObject.set(x, "TrainingJobStatus", js.undefined)
    
    inline def setTrainingStartTime(value: js.Date): Self = StObject.set(x, "TrainingStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingStartTimeUndefined: Self = StObject.set(x, "TrainingStartTime", js.undefined)
    
    inline def setTrainingTimeInSeconds(value: TrainingTimeInSeconds): Self = StObject.set(x, "TrainingTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTrainingTimeInSecondsUndefined: Self = StObject.set(x, "TrainingTimeInSeconds", js.undefined)
    
    inline def setTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "TuningJobArn", value.asInstanceOf[js.Any])
    
    inline def setTuningJobArnUndefined: Self = StObject.set(x, "TuningJobArn", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
