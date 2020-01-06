package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebuildWorkspacesRequest extends js.Object {
  /**
    * The WorkSpace to rebuild. You can specify a single WorkSpace.
    */
  var RebuildWorkspaceRequests: typings.awsDashSdk.clientsWorkspacesMod.RebuildWorkspaceRequests = js.native
}

object RebuildWorkspacesRequest {
  @scala.inline
  def apply(RebuildWorkspaceRequests: RebuildWorkspaceRequests): RebuildWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebuildWorkspaceRequests = RebuildWorkspaceRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RebuildWorkspacesRequest]
  }
}

