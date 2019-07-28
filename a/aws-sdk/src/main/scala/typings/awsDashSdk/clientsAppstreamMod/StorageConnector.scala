package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageConnector extends js.Object {
  /**
    * The type of storage connector.
    */
  var ConnectorType: StorageConnectorType
  /**
    * The names of the domains for the account.
    */
  var Domains: js.UndefOr[DomainList] = js.undefined
  /**
    * The ARN of the storage connector.
    */
  var ResourceIdentifier: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ResourceIdentifier] = js.undefined
}

object StorageConnector {
  @scala.inline
  def apply(
    ConnectorType: StorageConnectorType,
    Domains: DomainList = null,
    ResourceIdentifier: ResourceIdentifier = null
  ): StorageConnector = {
    val __obj = js.Dynamic.literal(ConnectorType = ConnectorType.asInstanceOf[js.Any])
    if (Domains != null) __obj.updateDynamic("Domains")(Domains)
    if (ResourceIdentifier != null) __obj.updateDynamic("ResourceIdentifier")(ResourceIdentifier)
    __obj.asInstanceOf[StorageConnector]
  }
}

