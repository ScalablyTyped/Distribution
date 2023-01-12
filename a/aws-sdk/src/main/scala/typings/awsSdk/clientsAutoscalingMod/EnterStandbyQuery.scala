package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterStandbyQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceIds] = js.undefined
  
  /**
    * Indicates whether to decrement the desired capacity of the Auto Scaling group by the number of instances moved to Standby mode.
    */
  var ShouldDecrementDesiredCapacity: typings.awsSdk.clientsAutoscalingMod.ShouldDecrementDesiredCapacity
}
object EnterStandbyQuery {
  
  inline def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity
  ): EnterStandbyQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterStandbyQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterStandbyQuery] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    inline def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
    
    inline def setShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = StObject.set(x, "ShouldDecrementDesiredCapacity", value.asInstanceOf[js.Any])
  }
}
