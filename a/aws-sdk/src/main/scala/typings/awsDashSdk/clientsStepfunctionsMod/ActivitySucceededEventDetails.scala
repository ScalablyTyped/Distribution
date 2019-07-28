package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitySucceededEventDetails extends js.Object {
  /**
    * The JSON data output by the activity task.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
}

object ActivitySucceededEventDetails {
  @scala.inline
  def apply(output: SensitiveData = null): ActivitySucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[ActivitySucceededEventDetails]
  }
}

