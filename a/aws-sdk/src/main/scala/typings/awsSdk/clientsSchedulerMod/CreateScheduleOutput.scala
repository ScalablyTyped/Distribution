package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduleOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schedule.
    */
  var ScheduleArn: typings.awsSdk.clientsSchedulerMod.ScheduleArn
}
object CreateScheduleOutput {
  
  inline def apply(ScheduleArn: ScheduleArn): CreateScheduleOutput = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateScheduleOutput] (val x: Self) extends AnyVal {
    
    inline def setScheduleArn(value: ScheduleArn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
  }
}
