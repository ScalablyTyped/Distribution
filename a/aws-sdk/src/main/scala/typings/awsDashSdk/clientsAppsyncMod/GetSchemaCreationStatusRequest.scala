package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSchemaCreationStatusRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
}

object GetSchemaCreationStatusRequest {
  @scala.inline
  def apply(apiId: String): GetSchemaCreationStatusRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSchemaCreationStatusRequest]
  }
}

