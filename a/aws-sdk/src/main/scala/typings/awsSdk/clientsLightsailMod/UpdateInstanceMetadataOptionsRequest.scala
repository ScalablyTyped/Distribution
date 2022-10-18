package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceMetadataOptionsRequest extends StObject {
  
  /**
    * Enables or disables the HTTP metadata endpoint on your instances. If this parameter is not specified, the existing state is maintained. If you specify a value of disabled, you cannot access your instance metadata.
    */
  var httpEndpoint: js.UndefOr[HttpEndpoint] = js.undefined
  
  /**
    * Enables or disables the IPv6 endpoint for the instance metadata service. This setting applies only when the HTTP metadata endpoint is enabled.  This parameter is available only for instances in the Europe (Stockholm) Amazon Web Services Region (eu-north-1). 
    */
  var httpProtocolIpv6: js.UndefOr[HttpProtocolIpv6] = js.undefined
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. A larger number means that the instance metadata requests can travel farther. If no parameter is specified, the existing state is maintained.
    */
  var httpPutResponseHopLimit: js.UndefOr[integer] = js.undefined
  
  /**
    * The state of token usage for your instance metadata requests. If the parameter is not specified in the request, the default state is optional. If the state is optional, you can choose whether to retrieve instance metadata with a signed token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role credentials are returned. If you retrieve the IAM role credentials by using a valid signed token, the version 2.0 role credentials are returned. If the state is required, you must send a signed token header with all instance metadata retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials. The version 1.0 credentials are not available.
    */
  var httpTokens: js.UndefOr[HttpTokens] = js.undefined
  
  /**
    * The name of the instance for which to update metadata parameters.
    */
  var instanceName: ResourceName
}
object UpdateInstanceMetadataOptionsRequest {
  
  inline def apply(instanceName: ResourceName): UpdateInstanceMetadataOptionsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstanceMetadataOptionsRequest]
  }
  
  extension [Self <: UpdateInstanceMetadataOptionsRequest](x: Self) {
    
    inline def setHttpEndpoint(value: HttpEndpoint): Self = StObject.set(x, "httpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointUndefined: Self = StObject.set(x, "httpEndpoint", js.undefined)
    
    inline def setHttpProtocolIpv6(value: HttpProtocolIpv6): Self = StObject.set(x, "httpProtocolIpv6", value.asInstanceOf[js.Any])
    
    inline def setHttpProtocolIpv6Undefined: Self = StObject.set(x, "httpProtocolIpv6", js.undefined)
    
    inline def setHttpPutResponseHopLimit(value: integer): Self = StObject.set(x, "httpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "httpPutResponseHopLimit", js.undefined)
    
    inline def setHttpTokens(value: HttpTokens): Self = StObject.set(x, "httpTokens", value.asInstanceOf[js.Any])
    
    inline def setHttpTokensUndefined: Self = StObject.set(x, "httpTokens", js.undefined)
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
