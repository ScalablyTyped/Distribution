package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTypeRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The type name.
    */
  var typeName: ResourceName
}

object DeleteTypeRequest {
  @scala.inline
  def apply(apiId: String, typeName: ResourceName): DeleteTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, typeName = typeName)
  
    __obj.asInstanceOf[DeleteTypeRequest]
  }
}

