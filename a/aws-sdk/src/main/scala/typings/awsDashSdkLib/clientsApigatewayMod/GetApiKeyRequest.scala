package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiKeyRequest extends js.Object {
  /**
    * [Required] The identifier of the ApiKey resource.
    */
  var apiKey: String
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains the key value.
    */
  var includeValue: js.UndefOr[NullableBoolean] = js.undefined
}

object GetApiKeyRequest {
  @scala.inline
  def apply(apiKey: String, includeValue: js.UndefOr[NullableBoolean] = js.undefined): GetApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (!js.isUndefined(includeValue)) __obj.updateDynamic("includeValue")(includeValue)
    __obj.asInstanceOf[GetApiKeyRequest]
  }
}

