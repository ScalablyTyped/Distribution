package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTapesOutput extends js.Object {
  /**
    * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
    */
  var TapeARNs: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.TapeARNs] = js.native
}

object CreateTapesOutput {
  @scala.inline
  def apply(TapeARNs: TapeARNs = null): CreateTapesOutput = {
    val __obj = js.Dynamic.literal()
    if (TapeARNs != null) __obj.updateDynamic("TapeARNs")(TapeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTapesOutput]
  }
}

