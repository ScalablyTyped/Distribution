package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConnectorDefinitionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string = js.native
}

object DeleteConnectorDefinitionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: __string): DeleteConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConnectorDefinitionRequest]
  }
}

