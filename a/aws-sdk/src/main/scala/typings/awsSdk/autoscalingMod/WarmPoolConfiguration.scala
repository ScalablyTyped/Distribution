package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarmPoolConfiguration extends StObject {
  
  /**
    * The instance reuse policy.
    */
  var InstanceReusePolicy: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceReusePolicy] = js.undefined
  
  /**
    * The maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
    */
  var MaxGroupPreparedCapacity: js.UndefOr[typings.awsSdk.autoscalingMod.MaxGroupPreparedCapacity] = js.undefined
  
  /**
    * The minimum number of instances to maintain in the warm pool.
    */
  var MinSize: js.UndefOr[WarmPoolMinSize] = js.undefined
  
  /**
    * The instance state to transition to after the lifecycle actions are complete.
    */
  var PoolState: js.UndefOr[WarmPoolState] = js.undefined
  
  /**
    * The status of a warm pool that is marked for deletion.
    */
  var Status: js.UndefOr[WarmPoolStatus] = js.undefined
}
object WarmPoolConfiguration {
  
  inline def apply(): WarmPoolConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarmPoolConfiguration]
  }
  
  extension [Self <: WarmPoolConfiguration](x: Self) {
    
    inline def setInstanceReusePolicy(value: InstanceReusePolicy): Self = StObject.set(x, "InstanceReusePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceReusePolicyUndefined: Self = StObject.set(x, "InstanceReusePolicy", js.undefined)
    
    inline def setMaxGroupPreparedCapacity(value: MaxGroupPreparedCapacity): Self = StObject.set(x, "MaxGroupPreparedCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxGroupPreparedCapacityUndefined: Self = StObject.set(x, "MaxGroupPreparedCapacity", js.undefined)
    
    inline def setMinSize(value: WarmPoolMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    inline def setPoolState(value: WarmPoolState): Self = StObject.set(x, "PoolState", value.asInstanceOf[js.Any])
    
    inline def setPoolStateUndefined: Self = StObject.set(x, "PoolState", js.undefined)
    
    inline def setStatus(value: WarmPoolStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
