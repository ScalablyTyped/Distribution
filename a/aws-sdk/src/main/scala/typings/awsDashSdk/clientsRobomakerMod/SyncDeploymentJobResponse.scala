package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncDeploymentJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the synchronization request.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the fleet was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  /**
    * Information about the deployment application configurations.
    */
  var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
  /**
    * The failure code if the job fails:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
    */
  var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
  /**
    * The failure reason if the job fails.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var fleet: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the synchronization job.
    */
  var status: js.UndefOr[DeploymentStatus] = js.undefined
}

object SyncDeploymentJobResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    createdAt: CreatedAt = null,
    deploymentApplicationConfigs: DeploymentApplicationConfigs = null,
    deploymentConfig: DeploymentConfig = null,
    failureCode: DeploymentJobErrorCode = null,
    failureReason: GenericString = null,
    fleet: Arn = null,
    status: DeploymentStatus = null
  ): SyncDeploymentJobResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (deploymentApplicationConfigs != null) __obj.updateDynamic("deploymentApplicationConfigs")(deploymentApplicationConfigs)
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig)
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (fleet != null) __obj.updateDynamic("fleet")(fleet)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncDeploymentJobResponse]
  }
}

