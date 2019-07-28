package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSubscriptionsByTopicResponse extends js.Object {
  /**
    * Token to pass along to the next ListSubscriptionsByTopic request. This element is returned if there are more subscriptions to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined
}

object ListSubscriptionsByTopicResponse {
  @scala.inline
  def apply(NextToken: nextToken = null, Subscriptions: SubscriptionsList = null): ListSubscriptionsByTopicResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    __obj.asInstanceOf[ListSubscriptionsByTopicResponse]
  }
}

