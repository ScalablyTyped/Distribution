package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeEnvironmentDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: String = js.native
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: String = js.native
  /**
    * The compute resources defined for the compute environment.
    */
  var computeResources: js.UndefOr[ComputeResource] = js.native
  /**
    * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
    */
  var ecsClusterArn: String = js.native
  /**
    * The service role associated with the compute environment that allows AWS Batch to make calls to AWS API operations on your behalf.
    */
  var serviceRole: js.UndefOr[String] = js.native
  /**
    * The state of the compute environment. The valid values are ENABLED or DISABLED. If the state is ENABLED, then the AWS Batch scheduler can attempt to place jobs from an associated job queue on the compute resources within the environment. If the compute environment is managed, then it can scale its instances out or in automatically, based on the job queue demand. If the state is DISABLED, then the AWS Batch scheduler does not attempt to place jobs within the environment. Jobs in a STARTING or RUNNING state continue to progress normally. Managed compute environments in the DISABLED state do not scale out. However, they scale in to minvCpus value after instances become idle.
    */
  var state: js.UndefOr[CEState] = js.native
  /**
    * The current status of the compute environment (for example, CREATING or VALID).
    */
  var status: js.UndefOr[CEStatus] = js.native
  /**
    * A short, human-readable string to provide additional details about the current status of the compute environment.
    */
  var statusReason: js.UndefOr[String] = js.native
  /**
    * The type of the compute environment.
    */
  var `type`: js.UndefOr[CEType] = js.native
}

object ComputeEnvironmentDetail {
  @scala.inline
  def apply(
    computeEnvironmentArn: String,
    computeEnvironmentName: String,
    ecsClusterArn: String,
    computeResources: ComputeResource = null,
    serviceRole: String = null,
    state: CEState = null,
    status: CEStatus = null,
    statusReason: String = null,
    `type`: CEType = null
  ): ComputeEnvironmentDetail = {
    val __obj = js.Dynamic.literal(computeEnvironmentArn = computeEnvironmentArn.asInstanceOf[js.Any], computeEnvironmentName = computeEnvironmentName.asInstanceOf[js.Any], ecsClusterArn = ecsClusterArn.asInstanceOf[js.Any])
    if (computeResources != null) __obj.updateDynamic("computeResources")(computeResources.asInstanceOf[js.Any])
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeEnvironmentDetail]
  }
}

