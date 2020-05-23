package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentationPartsRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The status of the API documentation parts to retrieve. Valid values are DOCUMENTED for retrieving DocumentationPart resources with content and UNDOCUMENTED for DocumentationPart resources without content.
    */
  var locationStatus: js.UndefOr[LocationStatusType] = js.native
  /**
    * The name of API entities of the to-be-retrieved documentation parts.
    */
  var nameQuery: js.UndefOr[String] = js.native
  /**
    * The path of API entities of the to-be-retrieved documentation parts.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The type of API entities of the to-be-retrieved documentation parts. 
    */
  var `type`: js.UndefOr[DocumentationPartType] = js.native
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
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (locationStatus != null) __obj.updateDynamic("locationStatus")(locationStatus.asInstanceOf[js.Any])
    if (nameQuery != null) __obj.updateDynamic("nameQuery")(nameQuery.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentationPartsRequest]
  }
}

