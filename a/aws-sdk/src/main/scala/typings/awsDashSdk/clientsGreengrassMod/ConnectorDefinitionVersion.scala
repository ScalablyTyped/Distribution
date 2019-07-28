package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorDefinitionVersion extends js.Object {
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[__listOfConnector] = js.undefined
}

object ConnectorDefinitionVersion {
  @scala.inline
  def apply(Connectors: __listOfConnector = null): ConnectorDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Connectors != null) __obj.updateDynamic("Connectors")(Connectors)
    __obj.asInstanceOf[ConnectorDefinitionVersion]
  }
}

