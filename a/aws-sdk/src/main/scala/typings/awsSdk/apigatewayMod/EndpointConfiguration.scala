package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointConfiguration extends StObject {
  
  /**
    * A list of endpoint types of an API (RestApi) or its custom domain name (DomainName). For an edge-optimized API and its custom domain name, the endpoint type is "EDGE". For a regional API and its custom domain name, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var types: js.UndefOr[ListOfEndpointType] = js.undefined
  
  /**
    * A list of VpcEndpointIds of an API (RestApi) against which to create Route53 ALIASes. It is only supported for PRIVATE endpoint type.
    */
  var vpcEndpointIds: js.UndefOr[ListOfString] = js.undefined
}
object EndpointConfiguration {
  
  inline def apply(): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfiguration]
  }
  
  extension [Self <: EndpointConfiguration](x: Self) {
    
    inline def setTypes(value: ListOfEndpointType): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: EndpointType*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setVpcEndpointIds(value: ListOfString): Self = StObject.set(x, "vpcEndpointIds", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdsUndefined: Self = StObject.set(x, "vpcEndpointIds", js.undefined)
    
    inline def setVpcEndpointIdsVarargs(value: String*): Self = StObject.set(x, "vpcEndpointIds", js.Array(value :_*))
  }
}
