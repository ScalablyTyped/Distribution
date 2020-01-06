package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RobotDeployment extends js.Object {
  /**
    * The robot deployment Amazon Resource Name (ARN).
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment finished.
    */
  var deploymentFinishTime: js.UndefOr[CreatedAt] = js.native
  /**
    * The time, in milliseconds since the epoch, when the deployment was started.
    */
  var deploymentStartTime: js.UndefOr[CreatedAt] = js.native
  /**
    * The robot deployment failure code.
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.native
  /**
    * A short description of the reason why the robot deployment failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * Information about how the deployment is progressing.
    */
  var progressDetail: js.UndefOr[ProgressDetail] = js.native
  /**
    * The status of the robot deployment.
    */
  var status: js.UndefOr[RobotStatus] = js.native
}

object RobotDeployment {
  @scala.inline
  def apply(
    arn: Arn = null,
    deploymentFinishTime: CreatedAt = null,
    deploymentStartTime: CreatedAt = null,
    failureCode: DeploymentJobErrorCode = null,
    failureReason: GenericString = null,
    progressDetail: ProgressDetail = null,
    status: RobotStatus = null
  ): RobotDeployment = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (deploymentFinishTime != null) __obj.updateDynamic("deploymentFinishTime")(deploymentFinishTime.asInstanceOf[js.Any])
    if (deploymentStartTime != null) __obj.updateDynamic("deploymentStartTime")(deploymentStartTime.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (progressDetail != null) __obj.updateDynamic("progressDetail")(progressDetail.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotDeployment]
  }
}

