package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConnectorDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[__listOfConnector] = js.undefined
}

object CreateConnectorDefinitionVersionRequest {
  @scala.inline
  def apply(
    ConnectorDefinitionId: __string,
    AmznClientToken: __string = null,
    Connectors: __listOfConnector = null
  ): CreateConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (Connectors != null) __obj.updateDynamic("Connectors")(Connectors)
    __obj.asInstanceOf[CreateConnectorDefinitionVersionRequest]
  }
}

