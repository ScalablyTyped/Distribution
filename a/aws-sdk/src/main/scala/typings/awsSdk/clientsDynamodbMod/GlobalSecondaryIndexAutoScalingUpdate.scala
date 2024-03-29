package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalSecondaryIndexAutoScalingUpdate extends StObject {
  
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.IndexName] = js.undefined
  
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
}
object GlobalSecondaryIndexAutoScalingUpdate {
  
  inline def apply(): GlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalSecondaryIndexAutoScalingUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalSecondaryIndexAutoScalingUpdate] (val x: Self) extends AnyVal {
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
  }
}
