package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyWorkspaceAccessPropertiesRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  /**
    * The device types and operating systems to enable or disable for access.
    */
  var WorkspaceAccessProperties: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceAccessProperties = js.native
}

object ModifyWorkspaceAccessPropertiesRequest {
  @scala.inline
  def apply(ResourceId: DirectoryId, WorkspaceAccessProperties: WorkspaceAccessProperties): ModifyWorkspaceAccessPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceAccessProperties = WorkspaceAccessProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyWorkspaceAccessPropertiesRequest]
  }
}

