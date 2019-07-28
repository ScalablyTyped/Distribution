package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepublishAction extends js.Object {
  /**
    * The ARN of the IAM role that grants access.
    */
  var roleArn: AwsArn
  /**
    * The name of the MQTT topic.
    */
  var topic: TopicPattern
}

object RepublishAction {
  @scala.inline
  def apply(roleArn: AwsArn, topic: TopicPattern): RepublishAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, topic = topic)
  
    __obj.asInstanceOf[RepublishAction]
  }
}

