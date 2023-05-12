package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointRequest extends StObject {
  
  /**
    * The authentication method used during the device connection.
    */
  var authenticationMethod: js.UndefOr[AuthenticationMethod] = js.undefined
  
  /**
    * The certificate ARN of the device. This is an optional parameter.
    */
  var certificateArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The device role ARN of the device. This is an optional parameter.
    */
  var deviceRoleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The thing ARN of the device. This is an optional parameter.
    */
  var thingArn: js.UndefOr[AmazonResourceName] = js.undefined
}
object GetEndpointRequest {
  
  inline def apply(): GetEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationMethod(value: AuthenticationMethod): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
    
    inline def setCertificateArn(value: AmazonResourceName): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setDeviceRoleArn(value: AmazonResourceName): Self = StObject.set(x, "deviceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceRoleArnUndefined: Self = StObject.set(x, "deviceRoleArn", js.undefined)
    
    inline def setThingArn(value: AmazonResourceName): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
  }
}
