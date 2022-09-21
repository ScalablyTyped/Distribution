package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceUserEndpointRequest extends StObject {
  
  /**
    * Boolean that controls whether the AppInstanceUserEndpoint is opted in to receive messages. ALL indicates the endpoint will receive all messages. NONE indicates the endpoint will receive no messages.
    */
  var AllowMessages: js.UndefOr[typings.awsSdk.chimesdkidentityMod.AllowMessages] = js.undefined
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: SensitiveChimeArn
  
  /**
    * The unique identifier of the AppInstanceUserEndpoint.
    */
  var EndpointId: SensitiveString64
  
  /**
    * The name of the AppInstanceUserEndpoint.
    */
  var Name: js.UndefOr[SensitiveString1600] = js.undefined
}
object UpdateAppInstanceUserEndpointRequest {
  
  inline def apply(AppInstanceUserArn: SensitiveChimeArn, EndpointId: SensitiveString64): UpdateAppInstanceUserEndpointRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppInstanceUserEndpointRequest]
  }
  
  extension [Self <: UpdateAppInstanceUserEndpointRequest](x: Self) {
    
    inline def setAllowMessages(value: AllowMessages): Self = StObject.set(x, "AllowMessages", value.asInstanceOf[js.Any])
    
    inline def setAllowMessagesUndefined: Self = StObject.set(x, "AllowMessages", js.undefined)
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: SensitiveString64): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setName(value: SensitiveString1600): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
