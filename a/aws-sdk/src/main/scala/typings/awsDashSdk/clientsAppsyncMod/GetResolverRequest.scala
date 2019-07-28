package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName
  /**
    * The resolver type name.
    */
  var typeName: ResourceName
}

object GetResolverRequest {
  @scala.inline
  def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): GetResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, fieldName = fieldName, typeName = typeName)
  
    __obj.asInstanceOf[GetResolverRequest]
  }
}

