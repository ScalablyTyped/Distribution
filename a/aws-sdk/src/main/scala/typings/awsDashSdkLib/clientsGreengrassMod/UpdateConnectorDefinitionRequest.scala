package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConnectorDefinitionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object UpdateConnectorDefinitionRequest {
  @scala.inline
  def apply(ConnectorDefinitionId: __string, Name: __string = null): UpdateConnectorDefinitionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateConnectorDefinitionRequest]
  }
}

