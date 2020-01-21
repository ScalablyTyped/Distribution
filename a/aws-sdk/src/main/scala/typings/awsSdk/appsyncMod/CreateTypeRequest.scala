package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The type definition, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var definition: String = js.native
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat = js.native
}

object CreateTypeRequest {
  @scala.inline
  def apply(apiId: String, definition: String, format: TypeDefinitionFormat): CreateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateTypeRequest]
  }
}

