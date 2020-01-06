package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelImportTaskResult extends js.Object {
  /**
    * The ID of the task being canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  /**
    * The current state of the task being canceled.
    */
  var PreviousState: js.UndefOr[String] = js.native
  /**
    * The current state of the task being canceled.
    */
  var State: js.UndefOr[String] = js.native
}

object CancelImportTaskResult {
  @scala.inline
  def apply(ImportTaskId: String = null, PreviousState: String = null, State: String = null): CancelImportTaskResult = {
    val __obj = js.Dynamic.literal()
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId.asInstanceOf[js.Any])
    if (PreviousState != null) __obj.updateDynamic("PreviousState")(PreviousState.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelImportTaskResult]
  }
}

