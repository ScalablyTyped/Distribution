package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomRoutingListenerResponse extends StObject {
  
  /**
    * The description of a listener for a custom routing accelerator.
    */
  var Listener: js.UndefOr[CustomRoutingListener] = js.undefined
}
object DescribeCustomRoutingListenerResponse {
  
  inline def apply(): DescribeCustomRoutingListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomRoutingListenerResponse]
  }
  
  extension [Self <: DescribeCustomRoutingListenerResponse](x: Self) {
    
    inline def setListener(value: CustomRoutingListener): Self = StObject.set(x, "Listener", value.asInstanceOf[js.Any])
    
    inline def setListenerUndefined: Self = StObject.set(x, "Listener", js.undefined)
  }
}
