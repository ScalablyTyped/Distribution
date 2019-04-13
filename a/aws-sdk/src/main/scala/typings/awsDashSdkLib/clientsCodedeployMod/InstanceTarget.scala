package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  A label that identifies whether the instance is an original target (BLUE) or a replacement target (GREEN). 
    */
  var instanceLabel: js.UndefOr[TargetLabel] = js.undefined
  /**
    *  The date and time when the target instance was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.undefined
  /**
    *  The lifecycle events of the deployment to this target instance. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  /**
    *  The status an EC2/On-premises deployment's target instance. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
  /**
    *  The unique ID of a deployment target that has a type of instanceTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}

object InstanceTarget {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    instanceLabel: TargetLabel = null,
    lastUpdatedAt: Time = null,
    lifecycleEvents: LifecycleEventList = null,
    status: TargetStatus = null,
    targetArn: TargetArn = null,
    targetId: TargetId = null
  ): InstanceTarget = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (instanceLabel != null) __obj.updateDynamic("instanceLabel")(instanceLabel.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    __obj.asInstanceOf[InstanceTarget]
  }
}

