package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentTargetsOutput extends js.Object {
  /**
    *  If a large amount of information is returned, a token identifier is also returned. It can be used in a subsequent ListDeploymentTargets call to return the next set of deployment targets in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    *  The unique IDs of deployment targets. 
    */
  var targetIds: js.UndefOr[TargetIdList] = js.native
}

object ListDeploymentTargetsOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, targetIds: TargetIdList = null): ListDeploymentTargetsOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (targetIds != null) __obj.updateDynamic("targetIds")(targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentTargetsOutput]
  }
}

