package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyReplicationInstanceResponse extends StObject {
  
  /**
    * The modified replication instance.
    */
  var ReplicationInstance: js.UndefOr[typings.awsSdk.clientsDmsMod.ReplicationInstance] = js.undefined
}
object ModifyReplicationInstanceResponse {
  
  inline def apply(): ModifyReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyReplicationInstanceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyReplicationInstanceResponse] (val x: Self) extends AnyVal {
    
    inline def setReplicationInstance(value: ReplicationInstance): Self = StObject.set(x, "ReplicationInstance", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceUndefined: Self = StObject.set(x, "ReplicationInstance", js.undefined)
  }
}
