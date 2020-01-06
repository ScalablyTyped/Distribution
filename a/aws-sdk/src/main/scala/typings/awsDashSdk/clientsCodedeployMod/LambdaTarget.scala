package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaTarget extends js.Object {
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.native
  /**
    *  A LambdaFunctionInfo object that describes a target Lambda function. 
    */
  var lambdaFunctionInfo: js.UndefOr[LambdaFunctionInfo] = js.native
  /**
    *  The date and time when the target Lambda function was updated by a deployment. 
    */
  var lastUpdatedAt: js.UndefOr[Time] = js.native
  /**
    *  The lifecycle events of the deployment to this target Lambda function. 
    */
  var lifecycleEvents: js.UndefOr[LifecycleEventList] = js.native
  /**
    *  The status an AWS Lambda deployment's target Lambda function. 
    */
  var status: js.UndefOr[TargetStatus] = js.native
  /**
    *  The ARN of the target. 
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
  /**
    *  The unique ID of a deployment target that has a type of lambdaTarget. 
    */
  var targetId: js.UndefOr[TargetId] = js.native
}

object LambdaTarget {
  @scala.inline
  def apply(
    deploymentId: DeploymentId = null,
    lambdaFunctionInfo: LambdaFunctionInfo = null,
    lastUpdatedAt: Time = null,
    lifecycleEvents: LifecycleEventList = null,
    status: TargetStatus = null,
    targetArn: TargetArn = null,
    targetId: TargetId = null
  ): LambdaTarget = {
    val __obj = js.Dynamic.literal()
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (lambdaFunctionInfo != null) __obj.updateDynamic("lambdaFunctionInfo")(lambdaFunctionInfo.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (lifecycleEvents != null) __obj.updateDynamic("lifecycleEvents")(lifecycleEvents.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (targetArn != null) __obj.updateDynamic("targetArn")(targetArn.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaTarget]
  }
}

