package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMigrationMessage extends StObject {
  
  /**
    * Forces the migration to stop without ensuring that data is in sync. It is recommended to use this option only to abort the migration and not recommended when application wants to continue migration to ElastiCache.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the replication group to which data is being migrated.
    */
  var ReplicationGroupId: String
}
object CompleteMigrationMessage {
  
  inline def apply(ReplicationGroupId: String): CompleteMigrationMessage = {
    val __obj = js.Dynamic.literal(ReplicationGroupId = ReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMigrationMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteMigrationMessage] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
