package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIdentityNotificationTopicRequest extends StObject {
  
  /**
    * The identity (email address or domain) that you want to set the Amazon SNS topic for.  You can only specify a verified identity for this parameter.  You can specify an identity by using its name or by using its Amazon Resource Name (ARN). The following examples are all valid identities: sender@example.com, example.com, arn:aws:ses:us-east-1:123456789012:identity/example.com.
    */
  var Identity: typings.awsSdk.clientsSesMod.Identity
  
  /**
    * The type of notifications that will be published to the specified Amazon SNS topic.
    */
  var NotificationType: typings.awsSdk.clientsSesMod.NotificationType
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic. If the parameter is omitted from the request or a null value is passed, SnsTopic is cleared and publishing is disabled.
    */
  var SnsTopic: js.UndefOr[NotificationTopic] = js.undefined
}
object SetIdentityNotificationTopicRequest {
  
  inline def apply(Identity: Identity, NotificationType: NotificationType): SetIdentityNotificationTopicRequest = {
    val __obj = js.Dynamic.literal(Identity = Identity.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIdentityNotificationTopicRequest]
  }
  
  extension [Self <: SetIdentityNotificationTopicRequest](x: Self) {
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "Identity", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    inline def setSnsTopic(value: NotificationTopic): Self = StObject.set(x, "SnsTopic", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicUndefined: Self = StObject.set(x, "SnsTopic", js.undefined)
  }
}
