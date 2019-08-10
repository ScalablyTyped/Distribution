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
  def apply(roleArn: AwsArn, topic: TopicPattern, qos: js.UndefOr[Qos] = js.undefined): RepublishAction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, topic = topic)
    if (!js.isUndefined(qos)) __obj.updateDynamic("qos")(qos)
    __obj.asInstanceOf[RepublishAction]
  }
}

