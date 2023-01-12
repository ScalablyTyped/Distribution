package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointGroupResponse extends StObject {
  
  /**
    * The description of an endpoint group.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.EndpointGroup] = js.undefined
}
object DescribeEndpointGroupResponse {
  
  inline def apply(): DescribeEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEndpointGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointGroup(value: EndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
