package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
}

object StartRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId = null): StartRequest = {
    val __obj = js.Dynamic.literal()
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId)
    __obj.asInstanceOf[StartRequest]
  }
}

