package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterStandbyQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceIds] = js.undefined
  
  /**
    * Indicates whether to decrement the desired capacity of the Auto Scaling group by the number of instances moved to Standby mode.
    */
  var ShouldDecrementDesiredCapacity: typings.awsSdk.autoscalingMod.ShouldDecrementDesiredCapacity
}
object EnterStandbyQuery {
  
  inline def apply(AutoScalingGroupName: ResourceName, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): EnterStandbyQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterStandbyQuery]
  }
  
  extension [Self <: EnterStandbyQuery](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    inline def setShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = StObject.set(x, "ShouldDecrementDesiredCapacity", value.asInstanceOf[js.Any])
  }
}
