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
  def apply(): ProductionBranch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductionBranch]
  }
  @scala.inline
  implicit class ProductionBranchOps[Self <: ProductionBranch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranchName: Self = this.set("branchName", js.undefined)
    @scala.inline
    def setLastDeployTime(value: LastDeployTime): Self = this.set("lastDeployTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastDeployTime: Self = this.set("lastDeployTime", js.undefined)
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setThumbnailUrl(value: ThumbnailUrl): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnailUrl: Self = this.set("thumbnailUrl", js.undefined)
  }
  
}

