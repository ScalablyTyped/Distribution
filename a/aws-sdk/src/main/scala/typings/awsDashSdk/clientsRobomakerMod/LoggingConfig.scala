package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfig extends js.Object {
  /**
    * A boolean indicating whether to record all ROS topics.
    */
  var recordAllRosTopics: BoxedBoolean
}

object LoggingConfig {
  @scala.inline
  def apply(recordAllRosTopics: BoxedBoolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(recordAllRosTopics = recordAllRosTopics)
  
    __obj.asInstanceOf[LoggingConfig]
  }
}

