package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapeRecoveryPointInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
  /**
    * The time when the point-in-time view of the virtual tape was replicated for later recovery. The default time stamp format of the tape recovery point time is in the ISO8601 extended YYYY-MM-DD'T'HH:MM:SS'Z' format.
    */
  var TapeRecoveryPointTime: js.UndefOr[Time] = js.undefined
  /**
    * The size, in bytes, of the virtual tapes to recover.
    */
  var TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined
  /**
    * The status of the virtual tapes.
    */
  var TapeStatus: js.UndefOr[TapeRecoveryPointStatus] = js.undefined
}

object TapeRecoveryPointInfo {
  @scala.inline
  def apply(
    TapeARN: TapeARN = null,
    TapeRecoveryPointTime: Time = null,
    TapeSizeInBytes: js.UndefOr[TapeSize] = js.undefined,
    TapeStatus: TapeRecoveryPointStatus = null
  ): TapeRecoveryPointInfo = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    if (TapeRecoveryPointTime != null) __obj.updateDynamic("TapeRecoveryPointTime")(TapeRecoveryPointTime)
    if (!js.isUndefined(TapeSizeInBytes)) __obj.updateDynamic("TapeSizeInBytes")(TapeSizeInBytes)
    if (TapeStatus != null) __obj.updateDynamic("TapeStatus")(TapeStatus)
    __obj.asInstanceOf[TapeRecoveryPointInfo]
  }
}

