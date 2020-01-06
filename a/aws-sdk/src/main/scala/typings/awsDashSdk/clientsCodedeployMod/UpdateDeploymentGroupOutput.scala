package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeploymentGroupOutput extends js.Object {
  /**
    * If the output contains no data, and the corresponding deployment group contained at least one Auto Scaling group, AWS CodeDeploy successfully removed all corresponding Auto Scaling lifecycle event hooks from the AWS account. If the output contains data, AWS CodeDeploy could not remove some Auto Scaling lifecycle event hooks from the AWS account.
    */
  var hooksNotCleanedUp: js.UndefOr[AutoScalingGroupList] = js.native
}

object UpdateDeploymentGroupOutput {
  @scala.inline
  def apply(hooksNotCleanedUp: AutoScalingGroupList = null): UpdateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (hooksNotCleanedUp != null) __obj.updateDynamic("hooksNotCleanedUp")(hooksNotCleanedUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeploymentGroupOutput]
  }
}

