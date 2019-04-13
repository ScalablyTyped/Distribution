package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionResponse extends js.Object {
  /**
    * The deployment package of the function or version.
    */
  var Code: js.UndefOr[FunctionCodeLocation] = js.undefined
  /**
    * The function's reserved concurrency.
    */
  var Concurrency: js.UndefOr[Concurrency] = js.undefined
  /**
    * The configuration of the function or version.
    */
  var Configuration: js.UndefOr[FunctionConfiguration] = js.undefined
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
}

object GetFunctionResponse {
  @scala.inline
  def apply(
    Code: FunctionCodeLocation = null,
    Concurrency: Concurrency = null,
    Configuration: FunctionConfiguration = null,
    Tags: Tags = null
  ): GetFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Concurrency != null) __obj.updateDynamic("Concurrency")(Concurrency)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetFunctionResponse]
  }
}

