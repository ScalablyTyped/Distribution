package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTapesOutput extends js.Object {
  /**
    * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
    */
  var TapeARNs: js.UndefOr[TapeARNs] = js.undefined
}

object CreateTapesOutput {
  @scala.inline
  def apply(TapeARNs: TapeARNs = null): CreateTapesOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARNs != null) __obj.updateDynamic("TapeARNs")(TapeARNs)
    __obj.asInstanceOf[CreateTapesOutput]
  }
}

