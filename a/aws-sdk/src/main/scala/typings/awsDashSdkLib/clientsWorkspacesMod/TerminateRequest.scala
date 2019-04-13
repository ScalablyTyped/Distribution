package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateRequest extends js.Object {
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: awsDashSdkLib.clientsWorkspacesMod.WorkspaceId
}

object TerminateRequest {
  @scala.inline
  def apply(WorkspaceId: WorkspaceId): TerminateRequest = {
    val __obj = js.Dynamic.literal(WorkspaceId = WorkspaceId)
  
    __obj.asInstanceOf[TerminateRequest]
  }
}

