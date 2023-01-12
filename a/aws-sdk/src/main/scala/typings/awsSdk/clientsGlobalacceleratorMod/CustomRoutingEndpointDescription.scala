package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomRoutingEndpointDescription extends StObject {
  
  /**
    * An ID for the endpoint. For custom routing accelerators, this is the virtual private cloud (VPC) subnet ID. 
    */
  var EndpointId: js.UndefOr[GenericString] = js.undefined
}
object CustomRoutingEndpointDescription {
  
  inline def apply(): CustomRoutingEndpointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRoutingEndpointDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomRoutingEndpointDescription] (val x: Self) extends AnyVal {
    
    inline def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
  }
}
