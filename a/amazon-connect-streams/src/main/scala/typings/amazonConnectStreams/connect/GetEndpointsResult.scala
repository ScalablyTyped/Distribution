package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointsResult extends StObject {
  
  var addresses: js.Array[Endpoint]
  
  var endpoints: js.Array[Endpoint]
}
object GetEndpointsResult {
  
  @scala.inline
  def apply(addresses: js.Array[Endpoint], endpoints: js.Array[Endpoint]): GetEndpointsResult = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointsResult]
  }
  
  @scala.inline
  implicit class GetEndpointsResultMutableBuilder[Self <: GetEndpointsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[Endpoint]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesVarargs(value: Endpoint*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: Endpoint*): Self = StObject.set(x, "endpoints", js.Array(value :_*))
  }
}
