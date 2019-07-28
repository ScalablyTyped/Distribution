package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
    */
  var StartWorkspaceRequests: typings.awsDashSdk.clientsWorkspacesMod.StartWorkspaceRequests
}

object StartWorkspacesRequest {
  @scala.inline
  def apply(StartWorkspaceRequests: StartWorkspaceRequests): StartWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StartWorkspaceRequests = StartWorkspaceRequests)
  
    __obj.asInstanceOf[StartWorkspacesRequest]
  }
}

