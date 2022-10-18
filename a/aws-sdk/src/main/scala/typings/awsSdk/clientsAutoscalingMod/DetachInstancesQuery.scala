package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachInstancesQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceIds] = js.undefined
  
  /**
    * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances detached.
    */
  var ShouldDecrementDesiredCapacity: typings.awsSdk.clientsAutoscalingMod.ShouldDecrementDesiredCapacity
}
object DetachInstancesQuery {
  
  inline def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  ): DetachInstancesQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachInstancesQuery]
  }
  
  extension [Self <: DetachInstancesQuery](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = StObject.set(x, "ShouldDecrementDesiredCapacity", value.asInstanceOf[js.Any])
  }
}
