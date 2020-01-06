package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressDetail extends js.Object {
  /**
    * The current progress status.  Validating  Validating the deployment.  DownloadingExtracting  Downloading and extracting the bundle on the robot.  ExecutingPreLaunch  Executing pre-launch script(s) if provided.  Launching  Launching the robot application.  ExecutingPostLaunch  Executing post-launch script(s) if provided.  Finished  Deployment is complete.  
    */
  var currentProgress: js.UndefOr[RobotDeploymentStep] = js.native
  /**
    * Estimated amount of time in seconds remaining in the step. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var estimatedTimeRemainingSeconds: js.UndefOr[GenericInteger] = js.native
  /**
    * Precentage of the step that is done. This currently only applies to the Downloading/Extracting step of the deployment. It is empty for other steps.
    */
  var percentDone: js.UndefOr[PercentDone] = js.native
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var targetResource: js.UndefOr[GenericString] = js.native
}

object ProgressDetail {
  @scala.inline
  def apply(
    currentProgress: RobotDeploymentStep = null,
    estimatedTimeRemainingSeconds: Int | Double = null,
    percentDone: Int | Double = null,
    targetResource: GenericString = null
  ): ProgressDetail = {
    val __obj = js.Dynamic.literal()
    if (currentProgress != null) __obj.updateDynamic("currentProgress")(currentProgress.asInstanceOf[js.Any])
    if (estimatedTimeRemainingSeconds != null) __obj.updateDynamic("estimatedTimeRemainingSeconds")(estimatedTimeRemainingSeconds.asInstanceOf[js.Any])
    if (percentDone != null) __obj.updateDynamic("percentDone")(percentDone.asInstanceOf[js.Any])
    if (targetResource != null) __obj.updateDynamic("targetResource")(targetResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressDetail]
  }
}

