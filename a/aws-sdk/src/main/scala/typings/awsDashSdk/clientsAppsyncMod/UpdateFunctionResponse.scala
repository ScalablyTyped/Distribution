package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFunctionResponse extends js.Object {
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}

object UpdateFunctionResponse {
  @scala.inline
  def apply(functionConfiguration: FunctionConfiguration = null): UpdateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (functionConfiguration != null) __obj.updateDynamic("functionConfiguration")(functionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFunctionResponse]
  }
}

