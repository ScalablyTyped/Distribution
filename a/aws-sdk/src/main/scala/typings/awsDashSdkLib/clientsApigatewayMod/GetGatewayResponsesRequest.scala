package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayResponsesRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500. The GatewayResponses collection does not support pagination and the limit does not apply here.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The current pagination position in the paged result set. The GatewayResponse collection does not support pagination and the position does not apply here.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetGatewayResponsesRequest {
  @scala.inline
  def apply(restApiId: String, limit: js.UndefOr[NullableInteger] = js.undefined, position: String = null): GetGatewayResponsesRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetGatewayResponsesRequest]
  }
}

