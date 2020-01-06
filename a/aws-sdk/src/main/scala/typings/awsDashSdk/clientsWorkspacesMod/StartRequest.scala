package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId] = js.native
}

object StartRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId = null): StartRequest = {
    val __obj = js.Dynamic.literal()
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRequest]
  }
}

