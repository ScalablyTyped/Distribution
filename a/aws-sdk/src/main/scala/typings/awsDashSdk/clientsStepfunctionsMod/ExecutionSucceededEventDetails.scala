package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionSucceededEventDetails extends js.Object {
  /**
    * The JSON data output by the execution.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
}

object ExecutionSucceededEventDetails {
  @scala.inline
  def apply(output: SensitiveData = null): ExecutionSucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[ExecutionSucceededEventDetails]
  }
}

