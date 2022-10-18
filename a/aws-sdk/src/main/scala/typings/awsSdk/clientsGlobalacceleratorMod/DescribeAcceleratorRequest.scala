package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator to describe.
    */
  var AcceleratorArn: GenericString
}
object DescribeAcceleratorRequest {
  
  inline def apply(AcceleratorArn: GenericString): DescribeAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorRequest]
  }
  
  extension [Self <: DescribeAcceleratorRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
