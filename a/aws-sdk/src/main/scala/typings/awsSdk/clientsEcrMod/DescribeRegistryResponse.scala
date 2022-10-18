package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegistryResponse extends StObject {
  
  /**
    * The ID of the registry.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The replication configuration for the registry.
    */
  var replicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
}
object DescribeRegistryResponse {
  
  inline def apply(): DescribeRegistryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegistryResponse]
  }
  
  extension [Self <: DescribeRegistryResponse](x: Self) {
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setReplicationConfiguration(value: ReplicationConfiguration): Self = StObject.set(x, "replicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setReplicationConfigurationUndefined: Self = StObject.set(x, "replicationConfiguration", js.undefined)
  }
}
