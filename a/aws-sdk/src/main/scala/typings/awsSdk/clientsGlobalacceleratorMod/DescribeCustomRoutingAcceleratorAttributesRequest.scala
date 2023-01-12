package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingAcceleratorAttributesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom routing accelerator to describe the attributes for.
    */
  var AcceleratorArn: GenericString
}
object DescribeCustomRoutingAcceleratorAttributesRequest {
  
  inline def apply(AcceleratorArn: GenericString): DescribeCustomRoutingAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomRoutingAcceleratorAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCustomRoutingAcceleratorAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
