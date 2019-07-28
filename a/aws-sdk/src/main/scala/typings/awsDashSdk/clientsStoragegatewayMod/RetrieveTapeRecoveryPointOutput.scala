package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveTapeRecoveryPointOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which the recovery point was retrieved.
    */
  var TapeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}

object RetrieveTapeRecoveryPointOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): RetrieveTapeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[RetrieveTapeRecoveryPointOutput]
  }
}

