package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyWorkspaceCreationPropertiesRequest extends js.Object {
  /**
    * The identifier of the directory.
    */
  var ResourceId: DirectoryId = js.native
  /**
    * The default properties for creating WorkSpaces.
    */
  var WorkspaceCreationProperties: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceCreationProperties = js.native
}

object ModifyWorkspaceCreationPropertiesRequest {
  @scala.inline
  def apply(ResourceId: DirectoryId, WorkspaceCreationProperties: WorkspaceCreationProperties): ModifyWorkspaceCreationPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], WorkspaceCreationProperties = WorkspaceCreationProperties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyWorkspaceCreationPropertiesRequest]
  }
}

