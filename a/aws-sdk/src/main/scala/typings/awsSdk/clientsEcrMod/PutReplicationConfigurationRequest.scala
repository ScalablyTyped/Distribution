package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutReplicationConfigurationRequest extends StObject {
  
  /**
    * An object representing the replication configuration for a registry.
    */
  var replicationConfiguration: ReplicationConfiguration
}
object PutReplicationConfigurationRequest {
  
  inline def apply(replicationConfiguration: ReplicationConfiguration): PutReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(replicationConfiguration = replicationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutReplicationConfigurationRequest]
  }
  
  extension [Self <: PutReplicationConfigurationRequest](x: Self) {
    
    inline def setReplicationConfiguration(value: ReplicationConfiguration): Self = StObject.set(x, "replicationConfiguration", value.asInstanceOf[js.Any])
  }
}
