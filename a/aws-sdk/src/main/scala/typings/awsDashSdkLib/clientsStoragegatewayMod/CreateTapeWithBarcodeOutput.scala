package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTapeWithBarcodeOutput extends js.Object {
  /**
    * A unique Amazon Resource Name (ARN) that represents the virtual tape that was created.
    */
  var TapeARN: js.UndefOr[TapeARN] = js.undefined
}

object CreateTapeWithBarcodeOutput {
  @scala.inline
  def apply(TapeARN: TapeARN = null): CreateTapeWithBarcodeOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARN != null) __obj.updateDynamic("TapeARN")(TapeARN)
    __obj.asInstanceOf[CreateTapeWithBarcodeOutput]
  }
}

