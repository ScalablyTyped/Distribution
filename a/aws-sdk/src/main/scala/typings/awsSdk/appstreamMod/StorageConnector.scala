package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageConnector extends StObject {
  
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
  implicit class StorageConnectorMutableBuilder[Self <: StorageConnector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorType(value: StorageConnectorType): Self = StObject.set(x, "ConnectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomains(value: DomainList): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
  }
}
