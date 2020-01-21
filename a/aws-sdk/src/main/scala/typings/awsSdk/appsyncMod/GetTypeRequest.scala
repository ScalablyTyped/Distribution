package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat = js.native
  /**
    * The type name.
    */
  var typeName: ResourceName = js.native
}

object GetTypeRequest {
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName): GetTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTypeRequest]
  }
}

