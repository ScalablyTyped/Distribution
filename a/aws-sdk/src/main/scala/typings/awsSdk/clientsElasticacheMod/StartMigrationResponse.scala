package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMigrationResponse extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.ReplicationGroup] = js.undefined
}
object StartMigrationResponse {
  
  inline def apply(): StartMigrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMigrationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartMigrationResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
