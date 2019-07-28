package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyWorkspacePropertiesRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceProperties
}

object ModifyWorkspacePropertiesRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceProperties: WorkspaceProperties): ModifyWorkspacePropertiesRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId, WorkspaceProperties = WorkspaceProperties)
  
    __obj.asInstanceOf[ModifyWorkspacePropertiesRequest]
  }
}

