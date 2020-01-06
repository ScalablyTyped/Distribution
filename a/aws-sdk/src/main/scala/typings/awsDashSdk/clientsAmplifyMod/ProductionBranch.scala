package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductionBranch extends js.Object {
  /**
    *  Branch Name for Production Branch. 
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    *  Last Deploy Time of Production Branch. 
    */
  var lastDeployTime: js.UndefOr[LastDeployTime] = js.native
  /**
    *  Status of Production Branch. 
    */
  var status: js.UndefOr[Status] = js.native
  /**
    *  Thumbnail URL for Production Branch. 
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

