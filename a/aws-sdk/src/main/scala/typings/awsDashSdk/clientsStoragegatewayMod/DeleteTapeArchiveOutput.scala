package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTapeArchiveOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape that was deleted from the virtual tape shelf (VTS).
    */
  var TapeARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARN] = js.native
}

object DeleteTapeArchiveOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): DeleteTapeArchiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapeArchiveOutput]
  }
}

