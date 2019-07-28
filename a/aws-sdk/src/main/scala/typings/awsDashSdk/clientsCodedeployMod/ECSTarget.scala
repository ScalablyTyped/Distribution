package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECSTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  The date and time when the target Amazon ECS application was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.undefined
  /**
    *  The lifecycle events of the deployment to this target Amazon ECS application. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  /**
    *  The status an Amazon ECS deployment's target ECS application. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
  /**
    *  The unique ID of a deployment target that has a type of ecsTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
  /**
    *  The ECSTaskSet objects associated with the ECS target. 
    */
  var taskSetsInfo: js.UndefOr[ECSTaskSetList] = js.undefined
}

object ECSTarget {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lastUpdatedAt: Time = null,
    lifecycleEvents: LifecycleEventList = null,
    status: TargetStatus = null,
    targetArn: TargetArn = null,
    targetId: TargetId = null,
    taskSetsInfo: ECSTaskSetList = null
  ): ECSTarget = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (taskSetsInfo != null) __obj.updateDynamic("taskSetsInfo")(taskSetsInfo)
    __obj.asInstanceOf[ECSTarget]
  }
}

