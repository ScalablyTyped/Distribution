package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAuthEventFeedbackRequest extends js.Object {
  /**
    * The event ID.
    */
  var EventId: EventIdType
  /**
    * The feedback token.
    */
  var FeedbackToken: TokenModelType
  /**
    * The authentication event feedback value.
    */
  var FeedbackValue: FeedbackValueType
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
  /**
    * The user pool username.
    */
  var Username: UsernameType
}

object UpdateAuthEventFeedbackRequest {
  @scala.inline
  def apply(
    EventId: EventIdType,
    FeedbackToken: TokenModelType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): UpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId, FeedbackToken = FeedbackToken, FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[UpdateAuthEventFeedbackRequest]
  }
}

