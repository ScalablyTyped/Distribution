package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSubscriptionNotificationConfigurationRequest extends StObject {
  
  /**
    * Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
    */
  var createSqs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The key name for the subscription notification.
    */
  var httpsApiKeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The key value for the subscription notification.
    */
  var httpsApiKeyValue: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTPS method used for the subscription notification. 
    */
  var httpsMethod: js.UndefOr[HttpsMethod] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) specifying the role of the subscriber. For more information about ARNs and how to use them in policies, see, see the Managing data access and Amazon Web Services Managed Policiesin the Amazon Security Lake User Guide.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The subscription endpoint in Security Lake.
    */
  var subscriptionEndpoint: js.UndefOr[UpdateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString] = js.undefined
  
  /**
    * The subscription ID for which the subscription notification is specified. 
    */
  var subscriptionId: UUID
}
object UpdateSubscriptionNotificationConfigurationRequest {
  
  inline def apply(subscriptionId: UUID): UpdateSubscriptionNotificationConfigurationRequest = {
    val __obj = js.Dynamic.literal(subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubscriptionNotificationConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSubscriptionNotificationConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    
    inline def setSubscriptionEndpoint(value: UpdateSubscriptionNotificationConfigurationRequestSubscriptionEndpointString): Self = StObject.set(x, "subscriptionEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionEndpointUndefined: Self = StObject.set(x, "subscriptionEndpoint", js.undefined)
    
    inline def setSubscriptionId(value: UUID): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
