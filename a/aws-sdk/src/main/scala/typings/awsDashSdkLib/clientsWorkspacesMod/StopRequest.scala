package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[WorkspaceId] = js.undefined
}

object StopRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId = null): StopRequest = {
    val __obj = js.Dynamic.literal()
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId)
    __obj.asInstanceOf[StopRequest]
  }
}

