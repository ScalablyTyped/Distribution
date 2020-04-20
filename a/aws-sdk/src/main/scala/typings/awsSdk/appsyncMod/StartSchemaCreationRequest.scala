package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSchemaCreationRequest extends js.Object {
  /**
    * The API ID.
    */
  var apiId: String = js.native
  /**
    * The schema definition, in GraphQL schema language format.
    */
  var definition: _Blob = js.native
}

object StartSchemaCreationRequest {
  @scala.inline
  def apply(apiId: String, definition: _Blob): StartSchemaCreationRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaCreationRequest]
  }
}

