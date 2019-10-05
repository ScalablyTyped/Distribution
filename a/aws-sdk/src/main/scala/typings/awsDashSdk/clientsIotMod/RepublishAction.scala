package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepublishAction extends js.Object {
  /**
    * The Quality of Service (QoS) level to use when republishing messages.
    */
  var qos: js.UndefOr[Qos] = js.undefined
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
  def apply(roleArn: AwsArn, topic: TopicPattern, qos: Int | Double = null): RepublishAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, topic = topic)
    if (qos != null) __obj.updateDynamic("qos")(qos.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepublishAction]
  }
}

