package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubscriptionNotificationConfigurationRequest extends StObject {
  
  /**
    * Create an Amazon Simple Queue Service queue.
    */
  var createSqs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key name for the notification subscription.
    */
  var httpsApiKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The key value for the notification subscription.
    */
  var httpsApiKeyValue: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTPS method used for the notification subscription. 
    */
  var httpsMethod: js.UndefOr[HttpsMethod] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more information about ARNs and how to use them in policies, see Managing data access and Amazon Web Services Managed Policies in the Amazon Security Lake User Guide.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this field.
    */
  var subscriptionEndpoint: js.UndefOr[CreateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString] = js.undefined
  
  /**
    * The subscription ID for the notification subscription.
    */
  var subscriptionId: UUID
}
object CreateSubscriptionNotificationConfigurationRequest {
  
  inline def apply(subscriptionId: UUID): CreateSubscriptionNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionNotificationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSubscriptionNotificationConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setCreateSqs(value: Boolean): Self = StObject.set(x, "createSqs", value.asInstanceOf[js.Any])
    
    inline def setCreateSqsUndefined: Self = StObject.set(x, "createSqs", js.undefined)
    
    inline def setHttpsApiKeyName(value: String): Self = StObject.set(x, "httpsApiKeyName", value.asInstanceOf[js.Any])
    
    inline def setHttpsApiKeyNameUndefined: Self = StObject.set(x, "httpsApiKeyName", js.undefined)
    
    inline def setHttpsApiKeyValue(value: String): Self = StObject.set(x, "httpsApiKeyValue", value.asInstanceOf[js.Any])
    
    inline def setHttpsApiKeyValueUndefined: Self = StObject.set(x, "httpsApiKeyValue", js.undefined)
    
    inline def setHttpsMethod(value: HttpsMethod): Self = StObject.set(x, "httpsMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpsMethodUndefined: Self = StObject.set(x, "httpsMethod", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setSubscriptionEndpoint(value: CreateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString): Self = StObject.set(x, "subscriptionEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionEndpointUndefined: Self = StObject.set(x, "subscriptionEndpoint", js.undefined)
    
    inline def setSubscriptionId(value: UUID): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
