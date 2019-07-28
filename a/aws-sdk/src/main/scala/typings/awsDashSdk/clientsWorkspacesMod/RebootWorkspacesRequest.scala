package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
    */
  var RebootWorkspaceRequests: typings.awsDashSdk.clientsWorkspacesMod.RebootWorkspaceRequests
}

object RebootWorkspacesRequest {
  @scala.inline
  def apply(RebootWorkspaceRequests: RebootWorkspaceRequests): RebootWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebootWorkspaceRequests = RebootWorkspaceRequests)
  
    __obj.asInstanceOf[RebootWorkspacesRequest]
  }
}

