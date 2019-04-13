package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedCreateWorkspaceRequest extends js.Object {
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.undefined
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.undefined
  /**
    * Information about the WorkSpace.
    */
  var WorkspaceRequest: js.UndefOr[WorkspaceRequest] = js.undefined
}

object FailedCreateWorkspaceRequest {
  @scala.inline
  def apply(
    ErrorCode: ErrorType = null,
    ErrorMessage: Description = null,
    WorkspaceRequest: WorkspaceRequest = null
  ): FailedCreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (WorkspaceRequest != null) __obj.updateDynamic("WorkspaceRequest")(WorkspaceRequest)
    __obj.asInstanceOf[FailedCreateWorkspaceRequest]
  }
}

