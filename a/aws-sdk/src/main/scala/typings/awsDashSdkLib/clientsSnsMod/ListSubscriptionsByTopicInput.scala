package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubscriptionsByTopicInput extends js.Object {
  /**
    * Token returned by the previous ListSubscriptionsByTopic request.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  /**
    * The ARN of the topic for which you wish to find subscriptions.
    */
  var TopicArn: topicARN
}

object ListSubscriptionsByTopicInput {
  @scala.inline
  def apply(TopicArn: topicARN, NextToken: nextToken = null): ListSubscriptionsByTopicInput = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListSubscriptionsByTopicInput]
  }
}

