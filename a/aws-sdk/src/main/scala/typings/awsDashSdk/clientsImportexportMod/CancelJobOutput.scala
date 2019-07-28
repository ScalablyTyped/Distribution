package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelJobOutput extends js.Object {
  var Success: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Success] = js.undefined
}

object CancelJobOutput {
  @scala.inline
  def apply(Success: js.UndefOr[Success] = js.undefined): CancelJobOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Success)) __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[CancelJobOutput]
  }
}

