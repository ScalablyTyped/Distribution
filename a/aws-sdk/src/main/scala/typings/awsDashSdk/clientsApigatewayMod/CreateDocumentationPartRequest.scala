package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDocumentationPartRequest extends js.Object {
  /**
    * [Required] The location of the targeted API entity of the to-be-created documentation part.
    */
  var location: DocumentationPartLocation
  /**
    * [Required] The new documentation content map of the targeted API entity. Enclosed key-value pairs are API-specific, but only OpenAPI-compliant key-value pairs can be exported and, hence, published.
    */
  var properties: String
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String
}

object CreateDocumentationPartRequest {
  @scala.inline
  def apply(location: DocumentationPartLocation, properties: String, restApiId: String): CreateDocumentationPartRequest = {
    val __obj = js.Dynamic.literal(location = location, properties = properties, restApiId = restApiId)
  
    __obj.asInstanceOf[CreateDocumentationPartRequest]
  }
}

