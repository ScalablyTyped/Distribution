package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSubscriptionInput extends js.Object {
  /**
    * Disallows unauthenticated unsubscribes of the subscription. If the value of this parameter is true and the request has an AWS signature, then only the topic owner and the subscription owner can unsubscribe the endpoint. The unsubscribe action requires AWS authentication. 
    */
  var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.native
  /**
    * Short-lived token sent to an endpoint during the Subscribe action.
    */
  var Token: token = js.native
  /**
    * The ARN of the topic for which you wish to confirm a subscription.
    */
  var TopicArn: topicARN = js.native
}

object ConfirmSubscriptionInput {
  @scala.inline
  def apply(Token: token, TopicArn: topicARN, AuthenticateOnUnsubscribe: authenticateOnUnsubscribe = null): ConfirmSubscriptionInput = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    if (AuthenticateOnUnsubscribe != null) __obj.updateDynamic("AuthenticateOnUnsubscribe")(AuthenticateOnUnsubscribe.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSubscriptionInput]
  }
}

