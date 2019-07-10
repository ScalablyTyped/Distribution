package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductionBranch extends js.Object {
  /**
    *  Branch Name for Production Branch. 
    */
  var branchName: js.UndefOr[BranchName] = js.undefined
  /**
    *  Last Deploy Time of Production Branch. 
    */
  var lastDeployTime: js.UndefOr[LastDeployTime] = js.undefined
  /**
    *  Status of Production Branch. 
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    *  Thumbnail URL for Production Branch. 
    */
  var thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
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
    if (branchName != null) __obj.updateDynamic("branchName")(branchName)
    if (lastDeployTime != null) __obj.updateDynamic("lastDeployTime")(lastDeployTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    __obj.asInstanceOf[ProductionBranch]
  }
}

