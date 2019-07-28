package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateComputeEnvironmentRequest extends js.Object {
  /**
    * The name or full Amazon Resource Name (ARN) of the compute environment to update.
    */
  var computeEnvironment: String
  /**
    * Details of the compute resources managed by the compute environment. Required for a managed compute environment.
    */
  var computeResources: js.UndefOr[ComputeResourceUpdate] = js.undefined
  /**
    * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf. If your specified role has a path other than /, then you must either specify the full role ARN (this is recommended) or prefix the role name with the path.  Depending on how you created your AWS Batch service role, its ARN may contain the service-role path prefix. When you only specify the name of the service role, AWS Batch assumes that your ARN does not use the service-role path prefix. Because of this, we recommend that you specify the full ARN of your service role when you create compute environments. 
    */
  var serviceRole: js.UndefOr[String] = js.undefined
  /**
    * The state of the compute environment. Compute environments in the ENABLED state can accept jobs from a queue and scale in or out automatically based on the workload demand of its associated queues.
    */
  var state: js.UndefOr[CEState] = js.undefined
}

object UpdateComputeEnvironmentRequest {
  @scala.inline
  def apply(
    computeEnvironment: String,
    computeResources: ComputeResourceUpdate = null,
    serviceRole: String = null,
    state: CEState = null
  ): UpdateComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment)
    if (computeResources != null) __obj.updateDynamic("computeResources")(computeResources)
    if (serviceRole != null) __obj.updateDynamic("serviceRole")(serviceRole)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComputeEnvironmentRequest]
  }
}

