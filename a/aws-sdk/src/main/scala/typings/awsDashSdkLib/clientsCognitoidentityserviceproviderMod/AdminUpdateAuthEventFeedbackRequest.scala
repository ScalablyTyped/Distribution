package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminUpdateAuthEventFeedbackRequest extends js.Object {
  /**
    * The authentication event ID.
    */
  var EventId: EventIdType
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

object AdminUpdateAuthEventFeedbackRequest {
  @scala.inline
  def apply(
    EventId: EventIdType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): AdminUpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId, FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId, Username = Username)
  
    __obj.asInstanceOf[AdminUpdateAuthEventFeedbackRequest]
  }
}

