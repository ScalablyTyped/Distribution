package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAppInstanceUserEndpointRequest extends StObject {
  
  /**
    * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. ALL indicates the endpoint receives all messages. NONE indicates the endpoint receives no messages.
    */
  var AllowMessages: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.AllowMessages] = js.undefined
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: SensitiveChimeArn
  
  /**
    * The idempotency token for each client request. 
    */
  var ClientRequestToken: typings.awsSdk.clientsChimesdkidentityMod.ClientRequestToken
  
  /**
    * The attributes of an Endpoint.
    */
  var EndpointAttributes: typings.awsSdk.clientsChimesdkidentityMod.EndpointAttributes
  
  /**
    * The name of the AppInstanceUserEndpoint.
    */
  var Name: js.UndefOr[SensitiveString1600] = js.undefined
  
  /**
    * The ARN of the resource to which the endpoint belongs.
    */
  var ResourceArn: SensitiveChimeArn
  
  /**
    * The type of the AppInstanceUserEndpoint. Supported types:    APNS: The mobile notification service for an Apple device.    APNS_SANDBOX: The sandbox environment of the mobile notification service for an Apple device.    GCM: The mobile notification service for an Android device.   Populate the ResourceArn value of each type as PinpointAppArn.
    */
  var Type: AppInstanceUserEndpointType
}
object RegisterAppInstanceUserEndpointRequest {
  
  inline def apply(
    AppInstanceUserArn: SensitiveChimeArn,
    ClientRequestToken: ClientRequestToken,
    EndpointAttributes: EndpointAttributes,
    ResourceArn: SensitiveChimeArn,
    Type: AppInstanceUserEndpointType
  ): RegisterAppInstanceUserEndpointRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], EndpointAttributes = EndpointAttributes.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterAppInstanceUserEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAppInstanceUserEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowMessages(value: AllowMessages): Self = StObject.set(x, "AllowMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowMessagesUndefined: Self = StObject.set(x, "AllowMessages", js.undefined)
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setEndpointAttributes(value: EndpointAttributes): Self = StObject.set(x, "EndpointAttributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: SensitiveString1600): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceArn(value: SensitiveChimeArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: AppInstanceUserEndpointType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
