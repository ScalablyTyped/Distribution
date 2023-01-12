package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointInfo extends StObject {
  
  /**
    * The name of a customer's endpoint.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
}
object EndpointInfo {
  
  inline def apply(EndpointName: EndpointName): EndpointInfo = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointInfo] (val x: Self) extends AnyVal {
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
