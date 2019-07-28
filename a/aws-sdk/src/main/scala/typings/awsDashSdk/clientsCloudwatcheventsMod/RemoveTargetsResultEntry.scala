package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTargetsResultEntry extends js.Object {
  /**
    * The error code that indicates why the target removal failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.ErrorCode] = js.undefined
  /**
    * The error message that explains why the target removal failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.ErrorMessage] = js.undefined
  /**
    * The ID of the target.
    */
  var TargetId: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.TargetId] = js.undefined
}

object RemoveTargetsResultEntry {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, TargetId: TargetId = null): RemoveTargetsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId)
    __obj.asInstanceOf[RemoveTargetsResultEntry]
  }
}

