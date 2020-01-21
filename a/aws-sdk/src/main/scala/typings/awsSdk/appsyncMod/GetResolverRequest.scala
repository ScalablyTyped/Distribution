package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName = js.native
  /**
    * The resolver type name.
    */
  var typeName: ResourceName = js.native
}

object GetResolverRequest {
  @scala.inline
  def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): GetResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetResolverRequest]
  }
}

