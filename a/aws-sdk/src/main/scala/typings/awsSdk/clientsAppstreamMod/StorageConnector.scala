package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageConnector extends StObject {
  
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
  var ResourceIdentifier: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ResourceIdentifier] = js.undefined
}
object StorageConnector {
  
  inline def apply(ConnectorType: StorageConnectorType): StorageConnector = {
    val __obj = js.Dynamic.literal(ConnectorType = ConnectorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConnector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageConnector] (val x: Self) extends AnyVal {
    
    inline def setConnectorType(value: StorageConnectorType): Self = StObject.set(x, "ConnectorType", value.asInstanceOf[js.Any])
    
    inline def setDomains(value: DomainList): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "Domains", js.undefined)
    
    inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "Domains", js.Array(value*))
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
  }
}
