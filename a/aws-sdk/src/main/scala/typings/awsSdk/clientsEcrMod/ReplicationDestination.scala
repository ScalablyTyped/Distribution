package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationDestination extends StObject {
  
  /**
    * The Region to replicate to.
    */
  var region: Region
  
  /**
    * The Amazon Web Services account ID of the Amazon ECR private registry to replicate to. When configuring cross-Region replication within your own registry, specify your own account ID.
    */
  var registryId: RegistryId
}
object ReplicationDestination {
  
  inline def apply(region: Region, registryId: RegistryId): ReplicationDestination = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], registryId = registryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationDestination]
  }
  
  extension [Self <: ReplicationDestination](x: Self) {
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
  }
}
