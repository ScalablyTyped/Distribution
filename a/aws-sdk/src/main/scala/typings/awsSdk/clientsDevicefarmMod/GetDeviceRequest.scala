package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceRequest extends StObject {
  
  /**
    * The device type's ARN.
    */
  var arn: AmazonResourceName
}
object GetDeviceRequest {
  
  inline def apply(arn: AmazonResourceName): GetDeviceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceRequest]
  }
  
  extension [Self <: GetDeviceRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
