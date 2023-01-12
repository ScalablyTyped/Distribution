package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskSchedule extends StObject {
  
  /**
    * A cron expression that specifies when DataSync initiates a scheduled transfer from a source to a destination location. 
    */
  var ScheduleExpression: ScheduleExpressionCron
}
object TaskSchedule {
  
  inline def apply(ScheduleExpression: ScheduleExpressionCron): TaskSchedule = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskSchedule] (val x: Self) extends AnyVal {
    
    inline def setScheduleExpression(value: ScheduleExpressionCron): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
  }
}
