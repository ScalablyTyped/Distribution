package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDevicePoolRequest extends StObject {
  
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm device pool to delete.
    */
  var arn: AmazonResourceName
}
object DeleteDevicePoolRequest {
  
  inline def apply(arn: AmazonResourceName): DeleteDevicePoolRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDevicePoolRequest]
  }
  
  extension [Self <: DeleteDevicePoolRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
