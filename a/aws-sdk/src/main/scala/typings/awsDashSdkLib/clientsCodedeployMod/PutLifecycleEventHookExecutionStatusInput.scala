package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLifecycleEventHookExecutionStatusInput extends js.Object {
  /**
    *  The unique ID of a deployment. Pass this ID to a Lambda function that validates a deployment lifecycle event. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  The execution ID of a deployment's lifecycle hook. A deployment lifecycle hook is specified in the hooks section of the AppSpec file. 
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.undefined
  /**
    * The result of a Lambda function that validates a deployment lifecycle event (Succeeded or Failed).
    */
  var status: js.UndefOr[LifecycleEventStatus] = js.undefined
}

object PutLifecycleEventHookExecutionStatusInput {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lifecycleEventHookExecutionId: LifecycleEventHookExecutionId = null,
    status: LifecycleEventStatus = null
  ): PutLifecycleEventHookExecutionStatusInput = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (lifecycleEventHookExecutionId != null) __obj.updateDynamic("lifecycleEventHookExecutionId")(lifecycleEventHookExecutionId)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusInput]
  }
}

