package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSchedule extends js.Object {
  /**
    * A cron expression that specifies when AWS DataSync initiates a scheduled transfer from a source to a destination location. 
    */
  var ScheduleExpression: ScheduleExpressionCron = js.native
}

object TaskSchedule {
  @scala.inline
  def apply(ScheduleExpression: ScheduleExpressionCron): TaskSchedule = {
    val __obj = js.Dynamic.literal(ScheduleExpression = ScheduleExpression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskSchedule]
  }
}

