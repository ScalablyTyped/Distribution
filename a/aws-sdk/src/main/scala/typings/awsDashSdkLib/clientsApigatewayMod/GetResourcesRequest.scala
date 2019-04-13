package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcesRequest extends js.Object {
  /**
    * A query parameter used to retrieve the specified resources embedded in the returned Resources resource in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources?embed=methods.
    */
  var embed: js.UndefOr[ListOfString] = js.undefined
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

object GetResourcesRequest {
  @scala.inline
  def apply(
    restApiId: String,
    embed: ListOfString = null,
    limit: js.UndefOr[NullableInteger] = js.undefined,
    position: String = null
  ): GetResourcesRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
    if (embed != null) __obj.updateDynamic("embed")(embed)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetResourcesRequest]
  }
}

