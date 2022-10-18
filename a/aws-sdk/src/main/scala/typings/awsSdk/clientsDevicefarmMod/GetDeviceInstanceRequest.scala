package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceInstanceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance you're requesting information about.
    */
  var arn: AmazonResourceName
}
object GetDeviceInstanceRequest {
  
  inline def apply(arn: AmazonResourceName): GetDeviceInstanceRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceInstanceRequest]
  }
  
  extension [Self <: GetDeviceInstanceRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
