package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedCreateWorkspaceRequest extends js.Object {
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.native
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  /**
    * Information about the WorkSpace.
    */
  var WorkspaceRequest: js.UndefOr[typings.awsDashSdk.clientsWorkspacesMod.WorkspaceRequest] = js.native
}

object FailedCreateWorkspaceRequest {
  @scala.inline
  def apply(
    ErrorCode: ErrorType = null,
    ErrorMessage: Description = null,
    WorkspaceRequest: WorkspaceRequest = null
  ): FailedCreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (WorkspaceRequest != null) __obj.updateDynamic("WorkspaceRequest")(WorkspaceRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedCreateWorkspaceRequest]
  }
}

