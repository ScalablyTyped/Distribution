package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyWorkspaceStateRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId
  /**
    * The WorkSpace state.
    */
  var WorkspaceState: TargetWorkspaceState
}

object ModifyWorkspaceStateRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceState: TargetWorkspaceState): ModifyWorkspaceStateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId, WorkspaceState = WorkspaceState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyWorkspaceStateRequest]
  }
}

