package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The type definition, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var definition: String
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
}

object CreateTypeRequest {
  @scala.inline
  def apply(apiId: String, definition: String, format: TypeDefinitionFormat): CreateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, definition = definition, format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTypeRequest]
  }
}

