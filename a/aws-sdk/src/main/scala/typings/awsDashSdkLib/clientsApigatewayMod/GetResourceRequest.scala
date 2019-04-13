package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceRequest extends js.Object {
  /**
    * A query parameter to retrieve the specified resources embedded in the returned Resource representation in the response. This embed parameter value is a list of comma-separated strings. Currently, the request supports only retrieval of the embedded Method resources this way. The query parameter value must be a single-valued list and contain the "methods" string. For example, GET /restapis/{restapi_id}/resources/{resource_id}?embed=methods.
    */
  var embed: js.UndefOr[ListOfString] = js.undefined
  /**
    * [Required] The identifier for the Resource resource.
    */
  var resourceId: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object GetResourceRequest {
  @scala.inline
  def apply(resourceId: String, restApiId: String, embed: ListOfString = null): GetResourceRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId, restApiId = restApiId)
    if (embed != null) __obj.updateDynamic("embed")(embed)
    __obj.asInstanceOf[GetResourceRequest]
  }
}

