package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointRequest extends StObject {
  
  /**
    * The certificate ARN of the device. This is an optional parameter.
    */
  var certificateArn: js.UndefOr[AmazonResourceName] = js.undefined
  
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
  
  extension [Self <: GetEndpointRequest](x: Self) {
    
    inline def setCertificateArn(value: AmazonResourceName): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setThingArn(value: AmazonResourceName): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
  }
}
