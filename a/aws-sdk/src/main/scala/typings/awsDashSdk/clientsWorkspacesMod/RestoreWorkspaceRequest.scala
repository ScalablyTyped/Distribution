package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreWorkspaceRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId
}

object RestoreWorkspaceRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): RestoreWorkspaceRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId)
  
    __obj.asInstanceOf[RestoreWorkspaceRequest]
  }
}

