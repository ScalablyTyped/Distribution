package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IotTopicPublishAction extends js.Object {
  /**
    * The MQTT topic of the message.
    */
  var mqttTopic: MQTTTopic
}

object IotTopicPublishAction {
  @scala.inline
  def apply(mqttTopic: MQTTTopic): IotTopicPublishAction = {
    val __obj = js.Dynamic.literal(mqttTopic = mqttTopic)
  
    __obj.asInstanceOf[IotTopicPublishAction]
  }
}

