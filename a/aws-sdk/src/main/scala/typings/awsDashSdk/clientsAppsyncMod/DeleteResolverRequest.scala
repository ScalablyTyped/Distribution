package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResolverRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName
  /**
    * The name of the resolver type.
    */
  var typeName: ResourceName
}

object DeleteResolverRequest {
  @scala.inline
  def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): DeleteResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, fieldName = fieldName, typeName = typeName)
  
    __obj.asInstanceOf[DeleteResolverRequest]
  }
}

