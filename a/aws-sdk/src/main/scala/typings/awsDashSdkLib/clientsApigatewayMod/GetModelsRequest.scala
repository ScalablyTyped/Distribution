package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetModelsRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetModelsRequest {
  @scala.inline
  def apply(restApiId: String, limit: js.UndefOr[NullableInteger] = js.undefined, position: String = null): GetModelsRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetModelsRequest]
  }
}

