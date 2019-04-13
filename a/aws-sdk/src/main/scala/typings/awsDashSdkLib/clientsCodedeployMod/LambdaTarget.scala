package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  /**
    *  The date and time when the target Lambda function was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.undefined
  /**
    *  The lifecycle events of the deployment to this target Lambda function. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.undefined
  /**
    *  The status an AWS Lambda deployment's target Lambda function. 
    */
  var status: js.UndefOr[TargetStatus] = js.undefined
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.undefined
  /**
    *  The unique ID of a deployment target that has a type of lambdaTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.undefined
}

object LambdaTarget {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lastUpdatedAt: Time = null,
    lifecycleEvents: LifecycleEventList = null,
    status: TargetStatus = null,
    targetArn: TargetArn = null,
    targetId: TargetId = null
  ): LambdaTarget = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId)
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt)
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    __obj.asInstanceOf[LambdaTarget]
  }
}

