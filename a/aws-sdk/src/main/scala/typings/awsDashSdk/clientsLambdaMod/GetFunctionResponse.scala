package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionResponse extends js.Object {
  /**
    * The deployment package of the function or version.
    */
  var Code: js.UndefOr[FunctionCodeLocation] = js.native
  /**
    * The function's reserved concurrency.
    */
  var Concurrency: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Concurrency] = js.native
  /**
    * The configuration of the function or version.
    */
  var Configuration: js.UndefOr[FunctionConfiguration] = js.native
  /**
    * The function's tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Tags] = js.native
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
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Concurrency != null) __obj.updateDynamic("Concurrency")(Concurrency.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionResponse]
  }
}

