package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointResponse extends StObject {
  
  /**
    * Describes information associated with the specific endpoint.
    */
  var EndpointProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.EndpointProperties] = js.undefined
}
object DescribeEndpointResponse {
  
  inline def apply(): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
  
  extension [Self <: DescribeEndpointResponse](x: Self) {
    
    inline def setEndpointProperties(value: EndpointProperties): Self = StObject.set(x, "EndpointProperties", value.asInstanceOf[js.Any])
    
    inline def setEndpointPropertiesUndefined: Self = StObject.set(x, "EndpointProperties", js.undefined)
  }
}
