package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an accelerator.
    */
  var AcceleratorArn: GenericString
}
object DeleteAcceleratorRequest {
  
  inline def apply(AcceleratorArn: GenericString): DeleteAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAcceleratorRequest]
  }
  
  extension [Self <: DeleteAcceleratorRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
