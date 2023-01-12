package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCustomRoutingListenerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener to update.
    */
  var ListenerArn: GenericString
  
  /**
    * The updated port range to support for connections from clients to your accelerator. If you remove ports that are currently being used by a subnet endpoint, the call fails. Separately, you set port ranges for endpoints. For more information, see About endpoints for custom routing accelerators.
    */
  var PortRanges: typings.awsSdk.clientsGlobalacceleratorMod.PortRanges
}
object UpdateCustomRoutingListenerRequest {
  
  inline def apply(ListenerArn: GenericString, PortRanges: PortRanges): UpdateCustomRoutingListenerRequest = {
    val __obj = js.Dynamic.literal(ListenerArn = ListenerArn.asInstanceOf[js.Any], PortRanges = PortRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCustomRoutingListenerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCustomRoutingListenerRequest] (val x: Self) extends AnyVal {
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setPortRanges(value: PortRanges): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    inline def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value*))
  }
}
