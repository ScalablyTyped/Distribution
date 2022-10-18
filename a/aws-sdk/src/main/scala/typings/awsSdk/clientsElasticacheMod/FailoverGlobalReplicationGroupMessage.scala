package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverGlobalReplicationGroupMessage extends StObject {
  
  /**
    * The name of the Global datastore
    */
  var GlobalReplicationGroupId: String
  
  /**
    * The Amazon region of the primary cluster of the Global datastore
    */
  var PrimaryRegion: String
  
  /**
    * The name of the primary replication group
    */
  var PrimaryReplicationGroupId: String
}
object FailoverGlobalReplicationGroupMessage {
  
  inline def apply(GlobalReplicationGroupId: String, PrimaryRegion: String, PrimaryReplicationGroupId: String): FailoverGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupId = GlobalReplicationGroupId.asInstanceOf[js.Any], PrimaryRegion = PrimaryRegion.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverGlobalReplicationGroupMessage]
  }
  
  extension [Self <: FailoverGlobalReplicationGroupMessage](x: Self) {
    
    inline def setGlobalReplicationGroupId(value: String): Self = StObject.set(x, "GlobalReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryRegion(value: String): Self = StObject.set(x, "PrimaryRegion", value.asInstanceOf[js.Any])
    
    inline def setPrimaryReplicationGroupId(value: String): Self = StObject.set(x, "PrimaryReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
