package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUserEndpoint extends StObject {
  
  /**
    * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. ALL indicates the endpoint will receive all messages. NONE indicates the endpoint will receive no messages.
    */
  var AllowMessages: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.AllowMessages] = js.undefined
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined
  
  /**
    * The time at which an AppInstanceUserEndpoint was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The attributes of an Endpoint.
    */
  var EndpointAttributes: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.EndpointAttributes] = js.undefined
  
  /**
    * The unique identifier of the AppInstanceUserEndpoint.
    */
  var EndpointId: js.UndefOr[SensitiveString64] = js.undefined
  
  /**
    * A read-only field that represents the state of an AppInstanceUserEndpoint. Supported values:    ACTIVE: The AppInstanceUserEndpoint is active and able to receive messages. When ACTIVE, the EndpointStatusReason remains empty.    INACTIVE: The AppInstanceUserEndpoint is inactive and can't receive message. When INACTIVE, the corresponding reason will be conveyed through EndpointStatusReason.    INVALID_DEVICE_TOKEN indicates that an AppInstanceUserEndpoint is INACTIVE due to invalid device token    INVALID_PINPOINT_ARN indicates that an AppInstanceUserEndpoint is INACTIVE due to an invalid pinpoint ARN that was input through the ResourceArn field.  
    */
  var EndpointState: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.EndpointState] = js.undefined
  
  /**
    * The time at which an AppInstanceUserEndpoint was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the AppInstanceUserEndpoint.
    */
  var Name: js.UndefOr[SensitiveString1600] = js.undefined
  
  /**
    * The ARN of the resource to which the endpoint belongs.
    */
  var ResourceArn: js.UndefOr[SensitiveChimeArn] = js.undefined
  
  /**
    * The type of the AppInstanceUserEndpoint.
    */
  var Type: js.UndefOr[AppInstanceUserEndpointType] = js.undefined
}
object AppInstanceUserEndpoint {
  
  inline def apply(): AppInstanceUserEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceUserEndpoint] (val x: Self) extends AnyVal {
    
    inline def setAllowMessages(value: AllowMessages): Self = StObject.set(x, "AllowMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowMessagesUndefined: Self = StObject.set(x, "AllowMessages", js.undefined)
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEndpointAttributes(value: EndpointAttributes): Self = StObject.set(x, "EndpointAttributes", value.asInstanceOf[js.Any])
    
    inline def setEndpointAttributesUndefined: Self = StObject.set(x, "EndpointAttributes", js.undefined)
    
    inline def setEndpointId(value: SensitiveString64): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setEndpointState(value: EndpointState): Self = StObject.set(x, "EndpointState", value.asInstanceOf[js.Any])
    
    inline def setEndpointStateUndefined: Self = StObject.set(x, "EndpointState", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setName(value: SensitiveString1600): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourceArn(value: SensitiveChimeArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setType(value: AppInstanceUserEndpointType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
