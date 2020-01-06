package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorDefinitionVersion extends js.Object {
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[__listOfConnector] = js.native
}

object ConnectorDefinitionVersion {
  @scala.inline
  def apply(Connectors: __listOfConnector = null): ConnectorDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Connectors != null) __obj.updateDynamic("Connectors")(Connectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorDefinitionVersion]
  }
}

