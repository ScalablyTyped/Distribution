package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSimulationJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the simulation job.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * the failure behavior for the simulation job.
    */
  var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
  /**
    * The failure code of the simulation job if it failed:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
    */
  var failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined
  /**
    * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on your behalf.
    */
  var iamRole: js.UndefOr[IamRole] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the simulation job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  /**
    * The maximum simulation job duration in seconds. 
    */
  var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined
  /**
    * Simulation job output files location.
    */
  var outputLocation: js.UndefOr[OutputLocation] = js.undefined
  /**
    * The robot application used by the simulation job.
    */
  var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
  /**
    * The simulation application used by the simulation job.
    */
  var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
  /**
    * The simulation job execution duration in milliseconds.
    */
  var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined
  /**
    * The status of the simulation job.
    */
  var status: js.UndefOr[SimulationJobStatus] = js.undefined
  /**
    * The list of all tags added to the simulation job.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  /**
    * Information about the vpc configuration.
    */
  var vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
}

object CreateSimulationJobResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    clientRequestToken: ClientRequestToken = null,
    failureBehavior: FailureBehavior = null,
    failureCode: SimulationJobErrorCode = null,
    iamRole: IamRole = null,
    lastUpdatedAt: LastUpdatedAt = null,
    maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined,
    outputLocation: OutputLocation = null,
    robotApplications: RobotApplicationConfigs = null,
    simulationApplications: SimulationApplicationConfigs = null,
    simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined,
    status: SimulationJobStatus = null,
    tags: TagMap = null,
    vpcConfig: VPCConfigResponse = null
  ): CreateSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (failureBehavior != null) __obj.updateDynamic("failureBehavior")(failureBehavior.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (iamRole != null) __obj.updateDynamic("iamRole")(iamRole)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (!js.isUndefined(maxJobDurationInSeconds)) __obj.updateDynamic("maxJobDurationInSeconds")(maxJobDurationInSeconds)
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation)
    if (robotApplications != null) __obj.updateDynamic("robotApplications")(robotApplications)
    if (simulationApplications != null) __obj.updateDynamic("simulationApplications")(simulationApplications)
    if (!js.isUndefined(simulationTimeMillis)) __obj.updateDynamic("simulationTimeMillis")(simulationTimeMillis)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcConfig != null) __obj.updateDynamic("vpcConfig")(vpcConfig)
    __obj.asInstanceOf[CreateSimulationJobResponse]
  }
}

