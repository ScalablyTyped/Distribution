package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
  /**
    *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.native
  /**
    * The result of a Lambda function that validates a deployment lifecycle event (Succeeded or Failed).
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.native
}

object PutLifecycleEventHookExecutionStatusInput {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lifecycleEventHookExecutionId: LifecycleEventHookExecutionId = null,
    status: LifecycleEventStatus = null
  ): PutLifecycleEventHookExecutionStatusInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (lifecycleEventHookExecutionId != null) __obj.updateDynamic("lifecycleEventHookExecutionId")(lifecycleEventHookExecutionId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
  }
}

