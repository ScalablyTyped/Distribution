package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The type name.
    */
  var typeName: ResourceName = js.native
}

object DeleteTypeRequest {
  @scala.inline
  def apply(apiId: String, typeName: ResourceName): DeleteTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTypeRequest]
  }
}

