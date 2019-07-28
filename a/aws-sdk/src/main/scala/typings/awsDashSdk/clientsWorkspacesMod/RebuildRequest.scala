package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebuildRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId
}

object RebuildRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): RebuildRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId)
  
    __obj.asInstanceOf[RebuildRequest]
  }
}

