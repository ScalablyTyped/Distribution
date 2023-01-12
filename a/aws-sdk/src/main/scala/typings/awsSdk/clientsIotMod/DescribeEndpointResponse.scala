package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointResponse extends StObject {
  
  /**
    * The endpoint. The format of the endpoint is as follows: identifier.iot.region.amazonaws.com.
    */
  var endpointAddress: js.UndefOr[EndpointAddress] = js.undefined
}
object DescribeEndpointResponse {
  
  inline def apply(): DescribeEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEndpointResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEndpointResponse] (val x: Self) extends AnyVal {
    
    inline def setEndpointAddress(value: EndpointAddress): Self = StObject.set(x, "endpointAddress", value.asInstanceOf[js.Any])
    
    inline def setEndpointAddressUndefined: Self = StObject.set(x, "endpointAddress", js.undefined)
  }
}
