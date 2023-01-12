package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointRequest extends StObject {
  
  /**
    * The name of the endpoint you want to delete. For example, "Name":"us-east-2-custom_bus_A-endpoint"..
    */
  var Name: EndpointName
}
object DeleteEndpointRequest {
  
  inline def apply(Name: EndpointName): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: EndpointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
