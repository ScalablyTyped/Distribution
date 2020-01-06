package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecondaryStatusTransition extends js.Object {
  /**
    * A timestamp that shows when the training job transitioned out of this secondary status state into another secondary status state or when the training job has ended.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * A timestamp that shows when the training job transitioned to the current secondary status state.
    */
  var StartTime: Timestamp = js.native
  /**
    * Contains a secondary status information from a training job. Status might be one of the following secondary statuses:  InProgress     Starting - Starting the training job.    Downloading - An optional stage for algorithms that support File training input mode. It indicates that data is being downloaded to the ML storage volumes.    Training - Training is in progress.    Uploading - Training is complete and the model artifacts are being uploaded to the S3 location.    Completed     Completed - The training job has completed.    Failed     Failed - The training job has failed. The reason for the failure is returned in the FailureReason field of DescribeTrainingJobResponse.    Stopped     MaxRuntimeExceeded - The job stopped because it exceeded the maximum allowed runtime.    Stopped - The training job has stopped.    Stopping     Stopping - Stopping the training job.     We no longer support the following secondary statuses:    LaunchingMLInstances     PreparingTrainingStack     DownloadingTrainingImage   
    */
  var Status: SecondaryStatus = js.native
  /**
    * A detailed description of the progress within a secondary status.  Amazon SageMaker provides secondary statuses and status messages that apply to each of them:  Starting    Starting the training job.   Launching requested ML instances.   Insufficient capacity error from EC2 while launching instances, retrying!   Launched instance was unhealthy, replacing it!   Preparing the instances for training.    Training    Downloading the training image.   Training image download completed. Training in progress.      Status messages are subject to change. Therefore, we recommend not including them in code that programmatically initiates actions. For examples, don't use status messages in if statements.  To have an overview of your training job's progress, view TrainingJobStatus and SecondaryStatus in DescribeTrainingJob, and StatusMessage together. For example, at the start of a training job, you might see the following:    TrainingJobStatus - InProgress    SecondaryStatus - Training    StatusMessage - Downloading the training image  
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.StatusMessage] = js.native
}

object SecondaryStatusTransition {
  @scala.inline
  def apply(
    StartTime: Timestamp,
    Status: SecondaryStatus,
    EndTime: Timestamp = null,
    StatusMessage: StatusMessage = null
  ): SecondaryStatusTransition = {
    val __obj = js.Dynamic.literal(StartTime = StartTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondaryStatusTransition]
  }
}

