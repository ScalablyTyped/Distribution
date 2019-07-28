package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
    */
  var TerminateWorkspaceRequests: typings.awsDashSdk.clientsWorkspacesMod.TerminateWorkspaceRequests
}

object TerminateWorkspacesRequest {
  @scala.inline
  def apply(TerminateWorkspaceRequests: TerminateWorkspaceRequests): TerminateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(TerminateWorkspaceRequests = TerminateWorkspaceRequests)
  
    __obj.asInstanceOf[TerminateWorkspacesRequest]
  }
}

