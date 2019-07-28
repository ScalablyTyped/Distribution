package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmSubscriptionInput extends js.Object {
  /**
    * Disallows unauthenticated unsubscribes of the subscription. If the value of this parameter is true and the request has an AWS signature, then only the topic owner and the subscription owner can unsubscribe the endpoint. The unsubscribe action requires AWS authentication. 
    */
  var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.undefined
  /**
    * Short-lived token sent to an endpoint during the Subscribe action.
    */
  var Token: token
  /**
    * The ARN of the topic for which you wish to confirm a subscription.
    */
  var TopicArn: topicARN
}

object ConfirmSubscriptionInput {
  @scala.inline
  def apply(Token: token, TopicArn: topicARN, AuthenticateOnUnsubscribe: authenticateOnUnsubscribe = null): ConfirmSubscriptionInput = {
    val __obj = js.Dynamic.literal(Token = Token, TopicArn = TopicArn)
    if (AuthenticateOnUnsubscribe != null) __obj.updateDynamic("AuthenticateOnUnsubscribe")(AuthenticateOnUnsubscribe)
    __obj.asInstanceOf[ConfirmSubscriptionInput]
  }
}

