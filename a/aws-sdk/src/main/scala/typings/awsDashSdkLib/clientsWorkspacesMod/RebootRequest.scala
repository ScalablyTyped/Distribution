package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkspaceId
}

object RebootRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): RebootRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId)
  
    __obj.asInstanceOf[RebootRequest]
  }
}

