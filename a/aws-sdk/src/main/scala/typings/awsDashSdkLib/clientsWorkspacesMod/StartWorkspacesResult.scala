package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be started.
    */
  var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.undefined
}

object StartWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedStartWorkspaceRequests = null): StartWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests)
    __obj.asInstanceOf[StartWorkspacesResult]
  }
}

