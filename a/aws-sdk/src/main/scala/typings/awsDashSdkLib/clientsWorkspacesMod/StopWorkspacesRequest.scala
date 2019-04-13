package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
    */
  var StopWorkspaceRequests: awsDashSdkLib.clientsWorkspacesMod.StopWorkspaceRequests
}

object StopWorkspacesRequest {
  @scala.inline
  def apply(StopWorkspaceRequests: StopWorkspaceRequests): StopWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StopWorkspaceRequests = StopWorkspaceRequests)
  
    __obj.asInstanceOf[StopWorkspacesRequest]
  }
}

