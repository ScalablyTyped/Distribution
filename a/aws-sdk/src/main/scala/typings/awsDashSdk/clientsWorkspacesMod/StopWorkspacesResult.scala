package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be stopped.
    */
  var FailedRequests: js.UndefOr[FailedStopWorkspaceRequests] = js.native
}

object StopWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedStopWorkspaceRequests = null): StopWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkspacesResult]
  }
}

