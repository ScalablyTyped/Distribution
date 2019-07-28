package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetModelTemplateResponse extends js.Object {
  /**
    * The template value.
    */
  var Value: js.UndefOr[__string] = js.undefined
}

object GetModelTemplateResponse {
  @scala.inline
  def apply(Value: __string = null): GetModelTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[GetModelTemplateResponse]
  }
}

