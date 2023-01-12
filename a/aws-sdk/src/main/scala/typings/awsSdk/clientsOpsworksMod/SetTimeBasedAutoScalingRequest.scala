package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTimeBasedAutoScalingRequest extends StObject {
  
  /**
    * An AutoScalingSchedule with the instance schedule.
    */
  var AutoScalingSchedule: js.UndefOr[WeeklyAutoScalingSchedule] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: String
}
object SetTimeBasedAutoScalingRequest {
  
  inline def apply(InstanceId: String): SetTimeBasedAutoScalingRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimeBasedAutoScalingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTimeBasedAutoScalingRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingSchedule(value: WeeklyAutoScalingSchedule): Self = StObject.set(x, "AutoScalingSchedule", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingScheduleUndefined: Self = StObject.set(x, "AutoScalingSchedule", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
