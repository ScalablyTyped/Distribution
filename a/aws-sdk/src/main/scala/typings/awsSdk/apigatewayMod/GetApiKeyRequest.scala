package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApiKeyRequest extends js.Object {
  /**
    * [Required] The identifier of the ApiKey resource.
    */
  var apiKey: String = js.native
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains the key value.
    */
  var includeValue: js.UndefOr[NullableBoolean] = js.native
}

object GetApiKeyRequest {
  @scala.inline
  def apply(apiKey: String, includeValue: js.UndefOr[scala.Boolean] = js.undefined): GetApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(includeValue)) __obj.updateDynamic("includeValue")(includeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyRequest]
  }
}

