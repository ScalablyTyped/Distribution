package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetrieveTapeArchiveOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the retrieved virtual tape.
    */
  var TapeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARN] = js.undefined
}

object RetrieveTapeArchiveOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): RetrieveTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[RetrieveTapeArchiveOutput]
  }
}

