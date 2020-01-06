package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscriptionsByTopicInput extends js.Object {
  /**
    * Token returned by the previous ListSubscriptionsByTopic request.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  /**
    * The ARN of the topic for which you wish to find subscriptions.
    */
  var TopicArn: topicARN = js.native
}

object ListSubscriptionsByTopicInput {
  @scala.inline
  def apply(TopicArn: topicARN, NextToken: nextToken = null): ListSubscriptionsByTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSubscriptionsByTopicInput]
  }
}

