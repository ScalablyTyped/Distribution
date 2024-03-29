package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationInstanceResponse extends StObject {
  
  /**
    * The replication instance that was deleted.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationInstance] = js.undefined
}
object DeleteReplicationInstanceResponse {
  
  inline def apply(): DeleteReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
