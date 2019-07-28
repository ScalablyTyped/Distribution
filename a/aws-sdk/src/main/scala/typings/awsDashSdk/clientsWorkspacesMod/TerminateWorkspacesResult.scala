package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be terminated.
    */
  var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.undefined
}

object TerminateWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedTerminateWorkspaceRequests = null): TerminateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests)
    __obj.asInstanceOf[TerminateWorkspacesResult]
  }
}

