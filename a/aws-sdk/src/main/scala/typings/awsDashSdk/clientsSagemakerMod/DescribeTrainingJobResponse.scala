package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrainingJobResponse extends js.Object {
  /**
    * Information about the algorithm used for training, and algorithm metadata. 
    */
  var AlgorithmSpecification: typings.awsDashSdk.clientsSagemakerMod.AlgorithmSpecification
  /**
    * The billable time in seconds. You can calculate the savings from using managed spot training using the formula (1 - BillableTimeInSeconds / TrainingTimeInSeconds) * 100. For example, if BillableTimeInSeconds is 100 and TrainingTimeInSeconds is 500, the savings is 80%.
    */
  var BillableTimeInSeconds: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.BillableTimeInSeconds] = js.undefined
  var CheckpointConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.CheckpointConfig] = js.undefined
  /**
    * A timestamp that indicates when the training job was created.
    */
  var CreationTime: Timestamp
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithms in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean indicating whether managed spot training is enabled (True) or not (False).
    */
  var EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to allow inbound or outbound network calls, except for calls between peers within a training cluster for distributed training, choose True. If you enable network isolation for training jobs that are configured to use a VPC, Amazon SageMaker downloads and uploads customer data and model artifacts through the specified VPC, but the training container does not have network access.  The Semantic Segmentation built-in algorithm does not support network isolation. 
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  /**
    * If the training job failed, the reason it failed. 
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.undefined
  /**
    * A collection of MetricData objects that specify the names, values, and dates and times that the training algorithm emitted to Amazon CloudWatch.
    */
  var FinalMetricDataList: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FinalMetricDataList] = js.undefined
  /**
    * Algorithm-specific parameters. 
    */
  var HyperParameters: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.HyperParameters] = js.undefined
  /**
    * An array of Channel objects that describes each data input channel. 
    */
  var InputDataConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.InputDataConfig] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SageMaker Ground Truth labeling job that created the transform or training job.
    */
  var LabelingJobArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.LabelingJobArn] = js.undefined
  /**
    * A timestamp that indicates when the status of the training job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Information about the Amazon S3 location that is configured for storing model artifacts. 
    */
  var ModelArtifacts: typings.awsDashSdk.clientsSagemakerMod.ModelArtifacts
  /**
    * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates subfolders for model artifacts. 
    */
  var OutputDataConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.OutputDataConfig] = js.undefined
  /**
    * Resources, including ML compute instances and ML storage volumes, that are configured for model training. 
    */
  var ResourceConfig: typings.awsDashSdk.clientsSagemakerMod.ResourceConfig
  /**
    * The AWS Identity and Access Management (IAM) role configured for the training job. 
    */
  var RoleArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.RoleArn] = js.undefined
  /**
    *  Provides detailed information about the state of the training job. For detailed information on the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    MaxWaitTmeExceeded - The job stopped because it exceeded the maximum allowed wait time.    Interrupted - The job stopped because the managed spot training instances were interrupted.     Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
    */
  var SecondaryStatus: typings.awsDashSdk.clientsSagemakerMod.SecondaryStatus
  /**
    * A history of all of the secondary statuses that the training job has transitioned through.
    */
  var SecondaryStatusTransitions: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.SecondaryStatusTransitions] = js.undefined
  /**
    * Specifies a limit to how long a model training job can run. It also specifies the maximum time to wait for a spot instance. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: typings.awsDashSdk.clientsSagemakerMod.StoppingCondition
  /**
    * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: typings.awsDashSdk.clientsSagemakerMod.TrainingJobArn
  /**
    *  Name of the model training job. 
    */
  var TrainingJobName: typings.awsDashSdk.clientsSagemakerMod.TrainingJobName
  /**
    * The status of the training job. Amazon SageMaker provides the following training job statuses:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
    */
  var TrainingJobStatus: typings.awsDashSdk.clientsSagemakerMod.TrainingJobStatus
  /**
    * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The training time in seconds.
    */
  var TrainingTimeInSeconds: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrainingTimeInSeconds] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
    */
  var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined
  /**
    * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}

object DescribeTrainingJobResponse {
  @scala.inline
  def apply(
    AlgorithmSpecification: AlgorithmSpecification,
    CreationTime: Timestamp,
    ModelArtifacts: ModelArtifacts,
    ResourceConfig: ResourceConfig,
    SecondaryStatus: SecondaryStatus,
    StoppingCondition: StoppingCondition,
    TrainingJobArn: TrainingJobArn,
    TrainingJobName: TrainingJobName,
    TrainingJobStatus: TrainingJobStatus,
    BillableTimeInSeconds: js.UndefOr[BillableTimeInSeconds] = js.undefined,
    CheckpointConfig: CheckpointConfig = null,
    EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
    EnableManagedSpotTraining: js.UndefOr[Boolean] = js.undefined,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    FailureReason: FailureReason = null,
    FinalMetricDataList: FinalMetricDataList = null,
    HyperParameters: HyperParameters = null,
    InputDataConfig: InputDataConfig = null,
    LabelingJobArn: LabelingJobArn = null,
    LastModifiedTime: Timestamp = null,
    OutputDataConfig: OutputDataConfig = null,
    RoleArn: RoleArn = null,
    SecondaryStatusTransitions: SecondaryStatusTransitions = null,
    TrainingEndTime: Timestamp = null,
    TrainingStartTime: Timestamp = null,
    TrainingTimeInSeconds: js.UndefOr[TrainingTimeInSeconds] = js.undefined,
    TuningJobArn: HyperParameterTuningJobArn = null,
    VpcConfig: VpcConfig = null
  ): DescribeTrainingJobResponse = {
    val __obj = js.Dynamic.literal(AlgorithmSpecification = AlgorithmSpecification, CreationTime = CreationTime, ModelArtifacts = ModelArtifacts, ResourceConfig = ResourceConfig, SecondaryStatus = SecondaryStatus.asInstanceOf[js.Any], StoppingCondition = StoppingCondition, TrainingJobArn = TrainingJobArn, TrainingJobName = TrainingJobName, TrainingJobStatus = TrainingJobStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(BillableTimeInSeconds)) __obj.updateDynamic("BillableTimeInSeconds")(BillableTimeInSeconds)
    if (CheckpointConfig != null) __obj.updateDynamic("CheckpointConfig")(CheckpointConfig)
    if (!js.isUndefined(EnableInterContainerTrafficEncryption)) __obj.updateDynamic("EnableInterContainerTrafficEncryption")(EnableInterContainerTrafficEncryption)
    if (!js.isUndefined(EnableManagedSpotTraining)) __obj.updateDynamic("EnableManagedSpotTraining")(EnableManagedSpotTraining)
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (FinalMetricDataList != null) __obj.updateDynamic("FinalMetricDataList")(FinalMetricDataList)
    if (HyperParameters != null) __obj.updateDynamic("HyperParameters")(HyperParameters)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (LabelingJobArn != null) __obj.updateDynamic("LabelingJobArn")(LabelingJobArn)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (SecondaryStatusTransitions != null) __obj.updateDynamic("SecondaryStatusTransitions")(SecondaryStatusTransitions)
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime)
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime)
    if (!js.isUndefined(TrainingTimeInSeconds)) __obj.updateDynamic("TrainingTimeInSeconds")(TrainingTimeInSeconds)
    if (TuningJobArn != null) __obj.updateDynamic("TuningJobArn")(TuningJobArn)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[DescribeTrainingJobResponse]
  }
}

