package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessEndpoint extends StObject {
  
  /**
    * The type of interface endpoint.
    */
  var EndpointType: AccessEndpointType
  
  /**
    * The identifier (ID) of the VPC in which the interface endpoint is used.
    */
  var VpceId: js.UndefOr[String] = js.undefined
}
object AccessEndpoint {
  
  inline def apply(EndpointType: AccessEndpointType): AccessEndpoint = {
    val __obj = js.Dynamic.literal(EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessEndpoint]
  }
  
  extension [Self <: AccessEndpoint](x: Self) {
    
    inline def setEndpointType(value: AccessEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setVpceId(value: String): Self = StObject.set(x, "VpceId", value.asInstanceOf[js.Any])
    
    inline def setVpceIdUndefined: Self = StObject.set(x, "VpceId", js.undefined)
  }
}
