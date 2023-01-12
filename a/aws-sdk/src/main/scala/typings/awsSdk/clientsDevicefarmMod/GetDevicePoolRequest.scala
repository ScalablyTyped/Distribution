package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePoolRequest extends StObject {
  
  /**
    * The device pool's ARN.
    */
  var arn: AmazonResourceName
}
object GetDevicePoolRequest {
  
  inline def apply(arn: AmazonResourceName): GetDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDevicePoolRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
