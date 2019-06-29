package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebuildWorkspacesRequest extends js.Object {
  /**
    * The WorkSpace to rebuild. You can specify a single WorkSpace.
    */
  var RebuildWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.RebuildWorkspaceRequests
}

object RebuildWorkspacesRequest {
  @scala.inline
  def apply(RebuildWorkspaceRequests: RebuildWorkspaceRequests): RebuildWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebuildWorkspaceRequests = RebuildWorkspaceRequests)
  
    __obj.asInstanceOf[RebuildWorkspacesRequest]
  }
}

