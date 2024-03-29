package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateInstanceMetadataOptionsRequest extends StObject {
  
  /**
    * Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default state is enabled.  If you specify a value of disabled, you will not be able to access your instance metadata.  
    */
  var HttpEndpoint: js.UndefOr[LaunchTemplateInstanceMetadataEndpointState] = js.undefined
  
  /**
    * Enables or disables the IPv6 endpoint for the instance metadata service. Default: disabled 
    */
  var HttpProtocolIpv6: js.UndefOr[LaunchTemplateInstanceMetadataProtocolIpv6] = js.undefined
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Default: 1  Possible values: Integers from 1 to 64
    */
  var HttpPutResponseHopLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * IMDSv2 uses token-backed sessions. Set the use of HTTP tokens to optional (in other words, set the use of IMDSv2 to optional) or required (in other words, set the use of IMDSv2 to required).    optional - When IMDSv2 is optional, you can choose to retrieve instance metadata with or without a session token in your request. If you retrieve the IAM role credentials without a token, the IMDSv1 role credentials are returned. If you retrieve the IAM role credentials using a valid session token, the IMDSv2 role credentials are returned.    required - When IMDSv2 is required, you must send a session token with any instance metadata retrieval requests. In this state, retrieving the IAM role credentials always returns IMDSv2 credentials; IMDSv1 credentials are not available.   Default: optional 
    */
  var HttpTokens: js.UndefOr[LaunchTemplateHttpTokensState] = js.undefined
  
  /**
    * Set to enabled to allow access to instance tags from the instance metadata. Set to disabled to turn off access to instance tags from the instance metadata. For more information, see Work with instance tags using the instance metadata. Default: disabled 
    */
  var InstanceMetadataTags: js.UndefOr[LaunchTemplateInstanceMetadataTagsState] = js.undefined
}
object LaunchTemplateInstanceMetadataOptionsRequest {
  
  inline def apply(): LaunchTemplateInstanceMetadataOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMetadataOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchTemplateInstanceMetadataOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setHttpEndpoint(value: LaunchTemplateInstanceMetadataEndpointState): Self = StObject.set(x, "HttpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointUndefined: Self = StObject.set(x, "HttpEndpoint", js.undefined)
    
    inline def setHttpProtocolIpv6(value: LaunchTemplateInstanceMetadataProtocolIpv6): Self = StObject.set(x, "HttpProtocolIpv6", value.asInstanceOf[js.Any])
    
    inline def setHttpProtocolIpv6Undefined: Self = StObject.set(x, "HttpProtocolIpv6", js.undefined)
    
    inline def setHttpPutResponseHopLimit(value: Integer): Self = StObject.set(x, "HttpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "HttpPutResponseHopLimit", js.undefined)
    
    inline def setHttpTokens(value: LaunchTemplateHttpTokensState): Self = StObject.set(x, "HttpTokens", value.asInstanceOf[js.Any])
    
    inline def setHttpTokensUndefined: Self = StObject.set(x, "HttpTokens", js.undefined)
    
    inline def setInstanceMetadataTags(value: LaunchTemplateInstanceMetadataTagsState): Self = StObject.set(x, "InstanceMetadataTags", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataTagsUndefined: Self = StObject.set(x, "InstanceMetadataTags", js.undefined)
  }
}
