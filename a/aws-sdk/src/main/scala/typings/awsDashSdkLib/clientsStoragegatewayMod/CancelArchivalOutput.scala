package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelArchivalOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape for which archiving was canceled.
    */
  var TapeARN: js.UndefOr[TapeARN] = js.undefined
}

object CancelArchivalOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): CancelArchivalOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[CancelArchivalOutput]
  }
}

