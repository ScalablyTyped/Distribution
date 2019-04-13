package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelImportTaskResult extends js.Object {
  /**
    * The ID of the task being canceled.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  /**
    * The current state of the task being canceled.
    */
  var PreviousState: js.UndefOr[String] = js.undefined
  /**
    * The current state of the task being canceled.
    */
  var State: js.UndefOr[String] = js.undefined
}

object CancelImportTaskResult {
  @scala.inline
  def apply(ImportTaskId: String = null, PreviousState: String = null, State: String = null): CancelImportTaskResult = {
    val __obj = js.Dynamic.literal()
    if (ImportTaskId != null) __obj.updateDynamic("ImportTaskId")(ImportTaskId)
    if (PreviousState != null) __obj.updateDynamic("PreviousState")(PreviousState)
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[CancelImportTaskResult]
  }
}

