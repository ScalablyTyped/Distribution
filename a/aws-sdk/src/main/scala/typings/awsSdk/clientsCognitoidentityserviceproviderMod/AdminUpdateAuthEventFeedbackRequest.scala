package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminUpdateAuthEventFeedbackRequest extends StObject {
  
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
  
  inline def apply(
    EventId: EventIdType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): AdminUpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminUpdateAuthEventFeedbackRequest]
  }
  
  extension [Self <: AdminUpdateAuthEventFeedbackRequest](x: Self) {
    
    inline def setEventId(value: EventIdType): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setFeedbackValue(value: FeedbackValueType): Self = StObject.set(x, "FeedbackValue", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
