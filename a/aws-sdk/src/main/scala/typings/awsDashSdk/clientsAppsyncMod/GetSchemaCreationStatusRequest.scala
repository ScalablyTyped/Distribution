package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSchemaCreationStatusRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
}

object GetSchemaCreationStatusRequest {
  @scala.inline
  def apply(apiId: String): GetSchemaCreationStatusRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId)
  
    __obj.asInstanceOf[GetSchemaCreationStatusRequest]
  }
}

