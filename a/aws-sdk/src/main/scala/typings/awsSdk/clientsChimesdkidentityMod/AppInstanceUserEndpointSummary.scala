package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceUserEndpointSummary extends StObject {
  
  /**
    * BBoolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. ALL indicates the endpoint will receive all messages. NONE indicates the endpoint will receive no messages.
    */
  var AllowMessages: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.AllowMessages] = js.undefined
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined
  
  /**
    * The unique identifier of the AppInstanceUserEndpoint.
    */
  var EndpointId: js.UndefOr[SensitiveString64] = js.undefined
  
  /**
    * A read-only field that represent the state of an AppInstanceUserEndpoint.
    */
  var EndpointState: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.EndpointState] = js.undefined
  
  /**
    * The name of the AppInstanceUserEndpoint.
    */
  var Name: js.UndefOr[SensitiveString1600] = js.undefined
  
  /**
    * The type of the AppInstanceUserEndpoint.
    */
  var Type: js.UndefOr[AppInstanceUserEndpointType] = js.undefined
}
object AppInstanceUserEndpointSummary {
  
  inline def apply(): AppInstanceUserEndpointSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceUserEndpointSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceUserEndpointSummary] (val x: Self) extends AnyVal {
    
    inline def setAllowMessages(value: AllowMessages): Self = StObject.set(x, "AllowMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowMessagesUndefined: Self = StObject.set(x, "AllowMessages", js.undefined)
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setEndpointId(value: SensitiveString64): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setEndpointState(value: EndpointState): Self = StObject.set(x, "EndpointState", value.asInstanceOf[js.Any])
    
    inline def setEndpointStateUndefined: Self = StObject.set(x, "EndpointState", js.undefined)
    
    inline def setName(value: SensitiveString1600): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: AppInstanceUserEndpointType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
