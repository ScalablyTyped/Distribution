package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduleGroupOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schedule group.
    */
  var ScheduleGroupArn: typings.awsSdk.clientsSchedulerMod.ScheduleGroupArn
}
object CreateScheduleGroupOutput {
  
  inline def apply(ScheduleGroupArn: ScheduleGroupArn): CreateScheduleGroupOutput = {
    val __obj = js.Dynamic.literal(ScheduleGroupArn = ScheduleGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScheduleGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setScheduleGroupArn(value: ScheduleGroupArn): Self = StObject.set(x, "ScheduleGroupArn", value.asInstanceOf[js.Any])
  }
}
