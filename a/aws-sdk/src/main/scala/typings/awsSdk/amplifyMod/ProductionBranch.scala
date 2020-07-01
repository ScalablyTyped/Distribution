package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductionBranch extends js.Object {
  /**
    *  The branch name for the production branch. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    *  The last deploy time of the production branch. 
    */
  var lastDeployTime: js.UndefOr[LastDeployTime] = js.native
  /**
    *  The status of the production branch. 
    */
  var status: js.UndefOr[Status] = js.native
  /**
    *  The thumbnail URL for the production branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.native
}

object ProductionBranch {
  @scala.inline
  def apply(
    branchName: BranchName = null,
    lastDeployTime: LastDeployTime = null,
    status: Status = null,
    thumbnailUrl: ThumbnailUrl = null
  ): ProductionBranch = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (lastDeployTime != null) __obj.updateDynamic("lastDeployTime")(lastDeployTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionBranch]
  }
}

