package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectorDefinitionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string
}

object GetConnectorDefinitionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: __string): GetConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId)
  
    __obj.asInstanceOf[GetConnectorDefinitionRequest]
  }
}

