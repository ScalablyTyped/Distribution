package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionResponse extends js.Object {
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}

object GetFunctionResponse {
  @scala.inline
  def apply(functionConfiguration: FunctionConfiguration = null): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (functionConfiguration != null) __obj.updateDynamic("functionConfiguration")(functionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionResponse]
  }
}

