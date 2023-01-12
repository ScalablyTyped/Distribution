package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAppInstanceUserEndpointResponse extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: js.UndefOr[SensitiveChimeArn] = js.undefined
  
  /**
    * The unique identifier of the AppInstanceUserEndpoint.
    */
  var EndpointId: js.UndefOr[SensitiveString64] = js.undefined
}
object RegisterAppInstanceUserEndpointResponse {
  
  inline def apply(): RegisterAppInstanceUserEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAppInstanceUserEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAppInstanceUserEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceUserArn(value: SensitiveChimeArn): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserArnUndefined: Self = StObject.set(x, "AppInstanceUserArn", js.undefined)
    
    inline def setEndpointId(value: SensitiveString64): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
  }
}
