package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShardConfiguration extends StObject {
  
  /**
    * The number of read replica nodes in this shard.
    */
  var ReplicaCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A string that specifies the keyspace for a particular node group. Keyspaces range from 0 to 16,383. The string is in the format startkey-endkey.
    */
  var Slots: js.UndefOr[String] = js.undefined
}
object ShardConfiguration {
  
  inline def apply(): ShardConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShardConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShardConfiguration] (val x: Self) extends AnyVal {
    
    inline def setReplicaCount(value: IntegerOptional): Self = StObject.set(x, "ReplicaCount", value.asInstanceOf[js.Any])
    
    inline def setReplicaCountUndefined: Self = StObject.set(x, "ReplicaCount", js.undefined)
    
    inline def setSlots(value: String): Self = StObject.set(x, "Slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "Slots", js.undefined)
  }
}
