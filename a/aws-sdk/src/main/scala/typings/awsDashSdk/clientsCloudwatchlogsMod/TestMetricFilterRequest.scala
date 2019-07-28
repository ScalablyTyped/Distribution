package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestMetricFilterRequest extends js.Object {
  var filterPattern: FilterPattern
  /**
    * The log event messages to test.
    */
  var logEventMessages: TestEventMessages
}

object TestMetricFilterRequest {
  @scala.inline
  def apply(filterPattern: FilterPattern, logEventMessages: TestEventMessages): TestMetricFilterRequest = {
    val __obj = js.Dynamic.literal(filterPattern = filterPattern, logEventMessages = logEventMessages)
  
    __obj.asInstanceOf[TestMetricFilterRequest]
  }
}

