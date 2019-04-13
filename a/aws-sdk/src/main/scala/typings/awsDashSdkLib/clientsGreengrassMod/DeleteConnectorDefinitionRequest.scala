package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConnectorDefinitionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string
}

object DeleteConnectorDefinitionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: __string): DeleteConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId)
  
    __obj.asInstanceOf[DeleteConnectorDefinitionRequest]
  }
}

