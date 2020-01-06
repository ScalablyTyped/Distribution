package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConnectorDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string = js.native
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[__listOfConnector] = js.native
}

object CreateConnectorDefinitionVersionRequest {
  @scala.inline
  def apply(
    ConnectorDefinitionId: __string,
    AmznClientToken: __string = null,
    Connectors: __listOfConnector = null
  ): CreateConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Connectors != null) __obj.updateDynamic("Connectors")(Connectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectorDefinitionVersionRequest]
  }
}

