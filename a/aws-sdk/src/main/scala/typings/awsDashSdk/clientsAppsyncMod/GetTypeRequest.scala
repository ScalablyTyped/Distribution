package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
  /**
    * The type name.
    */
  var typeName: ResourceName
}

object GetTypeRequest {
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName): GetTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, format = format.asInstanceOf[js.Any], typeName = typeName)
  
    __obj.asInstanceOf[GetTypeRequest]
  }
}

