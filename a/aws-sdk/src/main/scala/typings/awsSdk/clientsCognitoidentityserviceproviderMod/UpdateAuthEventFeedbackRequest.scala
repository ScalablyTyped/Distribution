package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuthEventFeedbackRequest extends StObject {
  
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
  
  inline def apply(
    EventId: EventIdType,
    FeedbackToken: TokenModelType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): UpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], FeedbackToken = FeedbackToken.asInstanceOf[js.Any], FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthEventFeedbackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAuthEventFeedbackRequest] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: EventIdType): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setFeedbackToken(value: TokenModelType): Self = StObject.set(x, "FeedbackToken", value.asInstanceOf[js.Any])
    
    inline def setFeedbackValue(value: FeedbackValueType): Self = StObject.set(x, "FeedbackValue", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
