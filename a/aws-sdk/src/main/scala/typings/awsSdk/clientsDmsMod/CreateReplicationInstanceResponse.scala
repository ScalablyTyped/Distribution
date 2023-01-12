package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationInstanceResponse extends StObject {
  
  /**
    * The replication instance that was created.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationInstance] = js.undefined
}
object CreateReplicationInstanceResponse {
  
  inline def apply(): CreateReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
