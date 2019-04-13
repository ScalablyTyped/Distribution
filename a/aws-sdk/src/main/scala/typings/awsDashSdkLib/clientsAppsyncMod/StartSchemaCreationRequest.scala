package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSchemaCreationRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String
  /**
    * The schema definition, in GraphQL schema language format.
    */
  var definition: _Blob
}

object StartSchemaCreationRequest {
  @scala.inline
  def apply(apiId: String, definition: _Blob): StartSchemaCreationRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId, definition = definition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartSchemaCreationRequest]
  }
}

