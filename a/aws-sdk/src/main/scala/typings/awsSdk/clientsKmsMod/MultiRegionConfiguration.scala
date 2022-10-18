package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiRegionConfiguration extends StObject {
  
  /**
    * Indicates whether the KMS key is a PRIMARY or REPLICA key.
    */
  var MultiRegionKeyType: js.UndefOr[typings.awsSdk.clientsKmsMod.MultiRegionKeyType] = js.undefined
  
  /**
    * Displays the key ARN and Region of the primary key. This field includes the current KMS key if it is the primary key.
    */
  var PrimaryKey: js.UndefOr[MultiRegionKey] = js.undefined
  
  /**
    * displays the key ARNs and Regions of all replica keys. This field includes the current KMS key if it is a replica key.
    */
  var ReplicaKeys: js.UndefOr[MultiRegionKeyList] = js.undefined
}
object MultiRegionConfiguration {
  
  inline def apply(): MultiRegionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiRegionConfiguration]
  }
  
  extension [Self <: MultiRegionConfiguration](x: Self) {
    
    inline def setMultiRegionKeyType(value: MultiRegionKeyType): Self = StObject.set(x, "MultiRegionKeyType", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionKeyTypeUndefined: Self = StObject.set(x, "MultiRegionKeyType", js.undefined)
    
    inline def setPrimaryKey(value: MultiRegionKey): Self = StObject.set(x, "PrimaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "PrimaryKey", js.undefined)
    
    inline def setReplicaKeys(value: MultiRegionKeyList): Self = StObject.set(x, "ReplicaKeys", value.asInstanceOf[js.Any])
    
    inline def setReplicaKeysUndefined: Self = StObject.set(x, "ReplicaKeys", js.undefined)
    
    inline def setReplicaKeysVarargs(value: MultiRegionKey*): Self = StObject.set(x, "ReplicaKeys", js.Array(value*))
  }
}
