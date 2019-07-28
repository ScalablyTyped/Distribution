package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebuildWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpace that could not be rebuilt.
    */
  var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.undefined
}

object RebuildWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedRebuildWorkspaceRequests = null): RebuildWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests)
    __obj.asInstanceOf[RebuildWorkspacesResult]
  }
}

