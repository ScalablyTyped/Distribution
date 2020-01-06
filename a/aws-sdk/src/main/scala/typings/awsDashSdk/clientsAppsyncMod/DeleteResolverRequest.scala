package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResolverRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName = js.native
  /**
    * The name of the resolver type.
    */
  var typeName: ResourceName = js.native
}

object DeleteResolverRequest {
  @scala.inline
  def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): DeleteResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteResolverRequest]
  }
}

