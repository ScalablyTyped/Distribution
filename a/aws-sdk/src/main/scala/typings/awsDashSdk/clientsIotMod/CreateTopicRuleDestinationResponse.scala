package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTopicRuleDestinationResponse extends js.Object {
  /**
    * The topic rule destination.
    */
  var topicRuleDestination: js.UndefOr[TopicRuleDestination] = js.native
}

object CreateTopicRuleDestinationResponse {
  @scala.inline
  def apply(topicRuleDestination: TopicRuleDestination = null): CreateTopicRuleDestinationResponse = {
    val __obj = js.Dynamic.literal()
    if (topicRuleDestination != null) __obj.updateDynamic("topicRuleDestination")(topicRuleDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRuleDestinationResponse]
  }
}

