package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaGlobalSecondaryIndexAutoScalingUpdate extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.IndexName] = js.undefined
  
  var ProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
}
object ReplicaGlobalSecondaryIndexAutoScalingUpdate {
  
  inline def apply(): ReplicaGlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  }
  
  extension [Self <: ReplicaGlobalSecondaryIndexAutoScalingUpdate](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    inline def setProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedReadCapacityAutoScalingUpdate", js.undefined)
  }
}
