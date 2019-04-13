package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFunctionResponse extends js.Object {
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
}

object CreateFunctionResponse {
  @scala.inline
  def apply(functionConfiguration: FunctionConfiguration = null): CreateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (functionConfiguration != null) __obj.updateDynamic("functionConfiguration")(functionConfiguration)
    __obj.asInstanceOf[CreateFunctionResponse]
  }
}

