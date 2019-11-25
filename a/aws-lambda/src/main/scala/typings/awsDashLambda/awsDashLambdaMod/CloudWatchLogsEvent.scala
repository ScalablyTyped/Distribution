package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData
}

object CloudWatchLogsEvent {
  @scala.inline
  def apply(awslogs: CloudWatchLogsEventData): CloudWatchLogsEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudWatchLogsEvent]
  }
}

