package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalTableGlobalSecondaryIndexSettingsUpdate extends StObject {
  
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.clientsDynamodbMod.IndexName
  
  /**
    * Auto scaling settings for managing a global secondary index's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}
object GlobalTableGlobalSecondaryIndexSettingsUpdate {
  
  inline def apply(IndexName: IndexName): GlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
  
  extension [Self <: GlobalTableGlobalSecondaryIndexSettingsUpdate](x: Self) {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    
    inline def setProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityUnits", js.undefined)
  }
}
