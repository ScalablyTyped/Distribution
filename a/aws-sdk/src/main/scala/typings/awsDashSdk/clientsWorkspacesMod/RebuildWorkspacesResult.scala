package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebuildWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpace that could not be rebuilt.
    */
  var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.native
}

object RebuildWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedRebuildWorkspaceRequests = null): RebuildWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebuildWorkspacesResult]
  }
}

