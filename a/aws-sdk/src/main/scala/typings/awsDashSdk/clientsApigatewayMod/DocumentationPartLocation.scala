package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartLocation extends js.Object {
  /**
    * The HTTP verb of a method. It is a valid field for the API entity types of METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. The default value is * for any method. When an applicable child entity inherits the content of an entity of the same type with more general specifications of the other location attributes, the child entity's method attribute must match that of the parent entity exactly.
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * The name of the targeted API entity. It is a valid and required field for the API entity types of AUTHORIZER, MODEL, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY and RESPONSE_HEADER. It is an invalid field for any other entity type.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The URL path of the target. It is a valid field for the API entity types of RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. The default value is / for the root resource. When an applicable child entity inherits the content of another entity of the same type with more general specifications of the other location attributes, the child entity's path attribute must match that of the parent entity as a prefix.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The HTTP status code of a response. It is a valid field for the API entity types of RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. The default value is * for any status code. When an applicable child entity inherits the content of an entity of the same type with more general specifications of the other location attributes, the child entity's statusCode attribute must match that of the parent entity exactly.
    */
  var statusCode: js.UndefOr[DocumentationPartLocationStatusCode] = js.undefined
  /**
    * [Required] The type of API entity to which the documentation content applies. Valid values are API, AUTHORIZER, MODEL, RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, and RESPONSE_BODY. Content inheritance does not apply to any entity of the API, AUTHORIZER, METHOD, MODEL, REQUEST_BODY, or RESOURCE type.
    */
  var `type`: DocumentationPartType
}

object DocumentationPartLocation {
  @scala.inline
  def apply(
    `type`: DocumentationPartType,
    method: String = null,
    name: String = null,
    path: String = null,
    statusCode: DocumentationPartLocationStatusCode = null
  ): DocumentationPartLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[DocumentationPartLocation]
  }
}

