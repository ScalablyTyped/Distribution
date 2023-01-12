package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutWarmPoolType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale in. The default is to terminate instances in the Auto Scaling group when the group scales in.
    */
  var InstanceReusePolicy: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceReusePolicy] = js.undefined
  
  /**
    * Specifies the maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group. This is an optional property. Specify it only if you do not want the warm pool size to be determined by the difference between the group's maximum capacity and its desired capacity.   If a value for MaxGroupPreparedCapacity is not specified, Amazon EC2 Auto Scaling launches and maintains the difference between the group's maximum capacity and its desired capacity. If you specify a value for MaxGroupPreparedCapacity, Amazon EC2 Auto Scaling uses the difference between the MaxGroupPreparedCapacity and the desired capacity instead.  The size of the warm pool is dynamic. Only when MaxGroupPreparedCapacity and MinSize are set to the same value does the warm pool have an absolute size.  If the desired capacity of the Auto Scaling group is higher than the MaxGroupPreparedCapacity, the capacity of the warm pool is 0, unless you specify a value for MinSize. To remove a value that you previously set, include the property but specify -1 for the value. 
    */
  var MaxGroupPreparedCapacity: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxGroupPreparedCapacity] = js.undefined
  
  /**
    * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
    */
  var MinSize: js.UndefOr[WarmPoolMinSize] = js.undefined
  
  /**
    * Sets the instance state to transition to after the lifecycle actions are complete. Default is Stopped.
    */
  var PoolState: js.UndefOr[WarmPoolState] = js.undefined
}
object PutWarmPoolType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): PutWarmPoolType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutWarmPoolType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutWarmPoolType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceReusePolicy(value: InstanceReusePolicy): Self = StObject.set(x, "InstanceReusePolicy", value.asInstanceOf[js.Any])
    
    inline def setInstanceReusePolicyUndefined: Self = StObject.set(x, "InstanceReusePolicy", js.undefined)
    
    inline def setMaxGroupPreparedCapacity(value: MaxGroupPreparedCapacity): Self = StObject.set(x, "MaxGroupPreparedCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxGroupPreparedCapacityUndefined: Self = StObject.set(x, "MaxGroupPreparedCapacity", js.undefined)
    
    inline def setMinSize(value: WarmPoolMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    inline def setPoolState(value: WarmPoolState): Self = StObject.set(x, "PoolState", value.asInstanceOf[js.Any])
    
    inline def setPoolStateUndefined: Self = StObject.set(x, "PoolState", js.undefined)
  }
}
