package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
    */
  var Workspaces: WorkspaceRequestList
}

object CreateWorkspacesRequest {
  @scala.inline
  def apply(Workspaces: WorkspaceRequestList): CreateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(Workspaces = Workspaces)
  
    __obj.asInstanceOf[CreateWorkspacesRequest]
  }
}

