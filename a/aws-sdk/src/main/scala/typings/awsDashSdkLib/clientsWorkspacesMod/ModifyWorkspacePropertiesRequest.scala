package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyWorkspacePropertiesRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkspaceId
  /**
    * The properties of the WorkSpace.
    */
  var WorkspaceProperties: awsDashSdkLib.clientsWorkspacesMod.WorkspaceProperties
}

object ModifyWorkspacePropertiesRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId, WorkspaceProperties: WorkspaceProperties): ModifyWorkspacePropertiesRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId, WorkspaceProperties = WorkspaceProperties)
  
    __obj.asInstanceOf[ModifyWorkspacePropertiesRequest]
  }
}

