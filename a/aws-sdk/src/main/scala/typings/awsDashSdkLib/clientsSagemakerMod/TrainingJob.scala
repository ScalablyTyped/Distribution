package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingJob extends js.Object {
  /**
    * Information about the algorithm used for training, and algorithm metadata.
    */
  var AlgorithmSpecification: js.UndefOr[AlgorithmSpecification] = js.undefined
  /**
    * A timestamp that indicates when the training job was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * To encrypt all communications between ML compute instances in distributed training, choose True. Encryption provides greater security for distributed training, but training might take longer. How long it takes depends on the amount of communication between compute instances, especially if you use a deep learning algorithm in distributed training.
    */
  var EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined
  /**
    * If the TrainingJob was created with network isolation, the value is set to true. If network isolation is enabled, nodes can't communicate beyond the VPC they run in.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  /**
    * If the training job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * A list of final metric values that are set when the training job completes. Used only if the training job was configured to use metrics.
    */
  var FinalMetricDataList: js.UndefOr[FinalMetricDataList] = js.undefined
  /**
    * Algorithm-specific parameters.
    */
  var HyperParameters: js.UndefOr[HyperParameters] = js.undefined
  /**
    * An array of Channel objects that describes each data input channel.
    */
  var InputDataConfig: js.UndefOr[InputDataConfig] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the labeling job.
    */
  var LabelingJobArn: js.UndefOr[LabelingJobArn] = js.undefined
  /**
    * A timestamp that indicates when the status of the training job was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Information about the Amazon S3 location that is configured for storing model artifacts.
    */
  var ModelArtifacts: js.UndefOr[ModelArtifacts] = js.undefined
  /**
    * The S3 path where model artifacts that you configured when creating the job are stored. Amazon SageMaker creates subfolders for model artifacts.
    */
  var OutputDataConfig: js.UndefOr[OutputDataConfig] = js.undefined
  /**
    * Resources, including ML compute instances and ML storage volumes, that are configured for model training.
    */
  var ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined
  /**
    * The AWS Identity and Access Management (IAM) role configured for the training job.
    */
  var RoleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    *  Provides detailed information about the state of the training job. For detailed information about the secondary status of the training job, see StatusMessage under SecondaryStatusTransition. Amazon SageMaker provides primary statuses and secondary statuses that apply to each of them:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.      Valid values for SecondaryStatus are subject to change.   We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
    */
  var SecondaryStatus: js.UndefOr[SecondaryStatus] = js.undefined
  /**
    * A history of all of the secondary statuses that the training job has transitioned through.
    */
  var SecondaryStatusTransitions: js.UndefOr[SecondaryStatusTransitions] = js.undefined
  /**
    * Specifies a limit to how long a model training job can run. When the job reaches the time limit, Amazon SageMaker ends the training job. Use this API to cap model training costs. To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal, which delays job termination for 120 seconds. Algorithms can use this 120-second window to save the model artifacts, so the results of training are not lost. 
    */
  var StoppingCondition: js.UndefOr[StoppingCondition] = js.undefined
  /**
    * An array of key-value pairs. For more information, see Using Cost Allocation Tags in the AWS Billing and Cost Management User Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * Indicates the time when the training job ends on training instances. You are billed for the time interval between the value of TrainingStartTime and this time. For successful jobs and stopped jobs, this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job failure.
    */
  var TrainingEndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the training job.
    */
  var TrainingJobArn: js.UndefOr[TrainingJobArn] = js.undefined
  /**
    * The name of the training job.
    */
  var TrainingJobName: js.UndefOr[TrainingJobName] = js.undefined
  /**
    * The status of the training job. Training job statuses are:    InProgress - The training is in progress.    Completed - The training job has completed.    Failed - The training job has failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeTrainingJobResponse call.    Stopping - The training job is stopping.    Stopped - The training job has stopped.   For more detailed information, see SecondaryStatus. 
    */
  var TrainingJobStatus: js.UndefOr[TrainingJobStatus] = js.undefined
  /**
    * Indicates the time when the training job starts on training instances. You are billed for the time interval between this time and the value of TrainingEndTime. The start time in CloudWatch Logs might be later than this time. The difference is due to the time it takes to download the training data and to the size of the training container.
    */
  var TrainingStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the associated hyperparameter tuning job if the training job was launched by a hyperparameter tuning job.
    */
  var TuningJobArn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined
  /**
    * A VpcConfig object that specifies the VPC that this training job has access to. For more information, see Protect Training Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[VpcConfig] = js.undefined
}

object TrainingJob {
  @scala.inline
  def apply(
    AlgorithmSpecification: AlgorithmSpecification = null,
    CreationTime: Timestamp = null,
    EnableInterContainerTrafficEncryption: js.UndefOr[Boolean] = js.undefined,
    EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined,
    FailureReason: FailureReason = null,
    FinalMetricDataList: FinalMetricDataList = null,
    HyperParameters: HyperParameters = null,
    InputDataConfig: InputDataConfig = null,
    LabelingJobArn: LabelingJobArn = null,
    LastModifiedTime: Timestamp = null,
    ModelArtifacts: ModelArtifacts = null,
    OutputDataConfig: OutputDataConfig = null,
    ResourceConfig: ResourceConfig = null,
    RoleArn: RoleArn = null,
    SecondaryStatus: SecondaryStatus = null,
    SecondaryStatusTransitions: SecondaryStatusTransitions = null,
    StoppingCondition: StoppingCondition = null,
    Tags: TagList = null,
    TrainingEndTime: Timestamp = null,
    TrainingJobArn: TrainingJobArn = null,
    TrainingJobName: TrainingJobName = null,
    TrainingJobStatus: TrainingJobStatus = null,
    TrainingStartTime: Timestamp = null,
    TuningJobArn: HyperParameterTuningJobArn = null,
    VpcConfig: VpcConfig = null
  ): TrainingJob = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmSpecification != null) __obj.updateDynamic("AlgorithmSpecification")(AlgorithmSpecification)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (!js.isUndefined(EnableInterContainerTrafficEncryption)) __obj.updateDynamic("EnableInterContainerTrafficEncryption")(EnableInterContainerTrafficEncryption)
    if (!js.isUndefined(EnableNetworkIsolation)) __obj.updateDynamic("EnableNetworkIsolation")(EnableNetworkIsolation)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    if (FinalMetricDataList != null) __obj.updateDynamic("FinalMetricDataList")(FinalMetricDataList)
    if (HyperParameters != null) __obj.updateDynamic("HyperParameters")(HyperParameters)
    if (InputDataConfig != null) __obj.updateDynamic("InputDataConfig")(InputDataConfig)
    if (LabelingJobArn != null) __obj.updateDynamic("LabelingJobArn")(LabelingJobArn)
    if (LastModifiedTime != null) __obj.updateDynamic("LastModifiedTime")(LastModifiedTime)
    if (ModelArtifacts != null) __obj.updateDynamic("ModelArtifacts")(ModelArtifacts)
    if (OutputDataConfig != null) __obj.updateDynamic("OutputDataConfig")(OutputDataConfig)
    if (ResourceConfig != null) __obj.updateDynamic("ResourceConfig")(ResourceConfig)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (SecondaryStatus != null) __obj.updateDynamic("SecondaryStatus")(SecondaryStatus.asInstanceOf[js.Any])
    if (SecondaryStatusTransitions != null) __obj.updateDynamic("SecondaryStatusTransitions")(SecondaryStatusTransitions)
    if (StoppingCondition != null) __obj.updateDynamic("StoppingCondition")(StoppingCondition)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TrainingEndTime != null) __obj.updateDynamic("TrainingEndTime")(TrainingEndTime)
    if (TrainingJobArn != null) __obj.updateDynamic("TrainingJobArn")(TrainingJobArn)
    if (TrainingJobName != null) __obj.updateDynamic("TrainingJobName")(TrainingJobName)
    if (TrainingJobStatus != null) __obj.updateDynamic("TrainingJobStatus")(TrainingJobStatus.asInstanceOf[js.Any])
    if (TrainingStartTime != null) __obj.updateDynamic("TrainingStartTime")(TrainingStartTime)
    if (TuningJobArn != null) __obj.updateDynamic("TuningJobArn")(TuningJobArn)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[TrainingJob]
  }
}

