package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterAppInstanceUserEndpointRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: SensitiveChimeArn
  
  /**
    * The unique identifier of the AppInstanceUserEndpoint.
    */
  var EndpointId: SensitiveString64
}
object DeregisterAppInstanceUserEndpointRequest {
  
  inline def apply(AppInstanceUserArn: SensitiveChimeArn, EndpointId: SensitiveString64): DeregisterAppInstanceUserEndpointRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterAppInstanceUserEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterAppInstanceUserEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: SensitiveString64): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
  }
}
