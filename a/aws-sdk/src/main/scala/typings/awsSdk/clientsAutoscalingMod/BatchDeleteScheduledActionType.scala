package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteScheduledActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The names of the scheduled actions to delete. The maximum number allowed is 50. 
    */
  var ScheduledActionNames: typings.awsSdk.clientsAutoscalingMod.ScheduledActionNames
}
object BatchDeleteScheduledActionType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, ScheduledActionNames: ScheduledActionNames): BatchDeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionNames = ScheduledActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteScheduledActionType]
  }
  
  extension [Self <: BatchDeleteScheduledActionType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNames(value: ScheduledActionNames): Self = StObject.set(x, "ScheduledActionNames", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "ScheduledActionNames", js.Array(value*))
  }
}
