package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTargetsResultEntry extends js.Object {
  /**
    * The error code that indicates why the target addition failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
    */
  var ErrorCode: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.ErrorCode] = js.undefined
  /**
    * The error message that explains why the target addition failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.ErrorMessage] = js.undefined
  /**
    * The ID of the target.
    */
  var TargetId: js.UndefOr[typings.awsDashSdk.clientsEventbridgeMod.TargetId] = js.undefined
}

object PutTargetsResultEntry {
  @scala.inline
  def apply(ErrorCode: ErrorCode = null, ErrorMessage: ErrorMessage = null, TargetId: TargetId = null): PutTargetsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (TargetId != null) __obj.updateDynamic("TargetId")(TargetId)
    __obj.asInstanceOf[PutTargetsResultEntry]
  }
}

