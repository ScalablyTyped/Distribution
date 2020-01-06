package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelTemplateResponse extends js.Object {
  /**
    * The template value.
    */
  var Value: js.UndefOr[__string] = js.native
}

object GetModelTemplateResponse {
  @scala.inline
  def apply(Value: __string = null): GetModelTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelTemplateResponse]
  }
}

