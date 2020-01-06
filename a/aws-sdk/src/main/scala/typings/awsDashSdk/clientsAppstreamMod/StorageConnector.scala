package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageConnector extends js.Object {
  /**
    * The type of storage connector.
    */
  var ConnectorType: StorageConnectorType = js.native
  /**
    * The names of the domains for the account.
    */
  var Domains: js.UndefOr[DomainList] = js.native
  /**
    * The ARN of the storage connector.
    */
  var ResourceIdentifier: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ResourceIdentifier] = js.native
}

object StorageConnector {
  @scala.inline
  def apply(
    ConnectorType: StorageConnectorType,
    Domains: DomainList = null,
    ResourceIdentifier: ResourceIdentifier = null
  ): StorageConnector = {
    val __obj = js.Dynamic.literal(ConnectorType = ConnectorType.asInstanceOf[js.Any])
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (ResourceIdentifier != null) __obj.updateDynamic("ResourceIdentifier")(ResourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConnector]
  }
}

