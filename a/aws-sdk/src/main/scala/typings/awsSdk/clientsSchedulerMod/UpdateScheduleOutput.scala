package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateScheduleOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schedule that you updated.
    */
  var ScheduleArn: typings.awsSdk.clientsSchedulerMod.ScheduleArn
}
object UpdateScheduleOutput {
  
  inline def apply(ScheduleArn: ScheduleArn): UpdateScheduleOutput = {
    val __obj = js.Dynamic.literal(ScheduleArn = ScheduleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateScheduleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateScheduleOutput] (val x: Self) extends AnyVal {
    
    inline def setScheduleArn(value: ScheduleArn): Self = StObject.set(x, "ScheduleArn", value.asInstanceOf[js.Any])
  }
}
