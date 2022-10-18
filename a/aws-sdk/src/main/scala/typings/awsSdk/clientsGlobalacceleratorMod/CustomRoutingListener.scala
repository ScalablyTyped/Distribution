package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoutingListener extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The port range to support for connections from clients to your accelerator. Separately, you set port ranges for endpoints. For more information, see About endpoints for custom routing accelerators.
    */
  var PortRanges: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.PortRanges] = js.undefined
}
object CustomRoutingListener {
  
  inline def apply(): CustomRoutingListener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRoutingListener]
  }
  
  extension [Self <: CustomRoutingListener](x: Self) {
    
    inline def setListenerArn(value: GenericString): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
    
    inline def setListenerArnUndefined: Self = StObject.set(x, "ListenerArn", js.undefined)
    
    inline def setPortRanges(value: PortRanges): Self = StObject.set(x, "PortRanges", value.asInstanceOf[js.Any])
    
    inline def setPortRangesUndefined: Self = StObject.set(x, "PortRanges", js.undefined)
    
    inline def setPortRangesVarargs(value: PortRange*): Self = StObject.set(x, "PortRanges", js.Array(value*))
  }
}
