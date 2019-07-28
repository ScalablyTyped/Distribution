package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentationPartsRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The status of the API documentation parts to retrieve. Valid values are DOCUMENTED for retrieving DocumentationPart resources with content and UNDOCUMENTED for DocumentationPart resources without content.
    */
  var locationStatus: js.UndefOr[LocationStatusType] = js.undefined
  /**
    * The name of API entities of the to-be-retrieved documentation parts.
    */
  var nameQuery: js.UndefOr[String] = js.undefined
  /**
    * The path of API entities of the to-be-retrieved documentation parts.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
  /**
    * The type of API entities of the to-be-retrieved documentation parts. 
    */
  var `type`: js.UndefOr[DocumentationPartType] = js.undefined
}

object GetDocumentationPartsRequest {
  @scala.inline
  def apply(
    restApiId: String,
    limit: js.UndefOr[NullableInteger] = js.undefined,
    locationStatus: LocationStatusType = null,
    nameQuery: String = null,
    path: String = null,
    position: String = null,
    `type`: DocumentationPartType = null
  ): GetDocumentationPartsRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (locationStatus != null) __obj.updateDynamic("locationStatus")(locationStatus.asInstanceOf[js.Any])
    if (nameQuery != null) __obj.updateDynamic("nameQuery")(nameQuery)
    if (path != null) __obj.updateDynamic("path")(path)
    if (position != null) __obj.updateDynamic("position")(position)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationPartsRequest]
  }
}

