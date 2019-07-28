package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedWorkspaceChangeRequest extends js.Object {
  /**
    * The error code that is returned if the WorkSpace cannot be rebooted.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.undefined
  /**
    * The text of the error message that is returned if the WorkSpace cannot be rebooted.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceId] = js.undefined
}

object FailedWorkspaceChangeRequest {
  @scala.inline
  def apply(ErrorCode: ErrorType = null, ErrorMessage: Description = null, WorkspaceId: WorkspaceId = null): FailedWorkspaceChangeRequest = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId)
    __obj.asInstanceOf[FailedWorkspaceChangeRequest]
  }
}

