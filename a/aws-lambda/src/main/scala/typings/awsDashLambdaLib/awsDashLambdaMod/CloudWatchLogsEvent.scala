package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsEvent extends js.Object {
  var awslogs: CloudWatchLogsEventData
}

object CloudWatchLogsEvent {
  @scala.inline
  def apply(awslogs: CloudWatchLogsEventData): CloudWatchLogsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("awslogs")(awslogs)
    __obj.asInstanceOf[CloudWatchLogsEvent]
  }
}

