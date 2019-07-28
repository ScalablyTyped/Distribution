package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingConfigResponse extends js.Object {
  /**
    * The tracing mode.
    */
  var Mode: js.UndefOr[TracingMode] = js.undefined
}

object TracingConfigResponse {
  @scala.inline
  def apply(Mode: TracingMode = null): TracingConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingConfigResponse]
  }
}

