package typings.awsSdk.appstreamMod

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
  var ResourceIdentifier: js.UndefOr[typings.awsSdk.appstreamMod.ResourceIdentifier] = js.native
}

object StorageConnector {
  @scala.inline
  def apply(ConnectorType: StorageConnectorType): StorageConnector = {
    val __obj = js.Dynamic.literal(ConnectorType = ConnectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConnector]
  }
  @scala.inline
  implicit class StorageConnectorOps[Self <: StorageConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectorType(value: StorageConnectorType): Self = this.set("ConnectorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = this.set("Domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: DomainList): Self = this.set("Domains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomains: Self = this.set("Domains", js.undefined)
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = this.set("ResourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifier: Self = this.set("ResourceIdentifier", js.undefined)
  }
  
}

