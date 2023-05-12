package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataMetadataOptionsDetails extends StObject {
  
  /**
    *  Enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default state is enabled, and you won't be able to access your instance metadata. 
    */
  var HttpEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Enables or disables the IPv6 endpoint for the instance metadata service. 
    */
  var HttpProtocolIpv6: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. 
    */
  var HttpPutResponseHopLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The state of token usage for your instance metadata requests. 
    */
  var HttpTokens: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  When set to enabled, this parameter allows access to instance tags from the instance metadata. When set to disabled, it turns off access to instance tags from the instance metadata. For more information, see Work with instance tags in instance metadata in the Amazon EC2 User Guide. 
    */
  var InstanceMetadataTags: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataMetadataOptionsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataMetadataOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataMetadataOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataMetadataOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setHttpEndpoint(value: NonEmptyString): Self = StObject.set(x, "HttpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointUndefined: Self = StObject.set(x, "HttpEndpoint", js.undefined)
    
    inline def setHttpProtocolIpv6(value: NonEmptyString): Self = StObject.set(x, "HttpProtocolIpv6", value.asInstanceOf[js.Any])
    
    inline def setHttpProtocolIpv6Undefined: Self = StObject.set(x, "HttpProtocolIpv6", js.undefined)
    
    inline def setHttpPutResponseHopLimit(value: Integer): Self = StObject.set(x, "HttpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    inline def setHttpPutResponseHopLimitUndefined: Self = StObject.set(x, "HttpPutResponseHopLimit", js.undefined)
    
    inline def setHttpTokens(value: NonEmptyString): Self = StObject.set(x, "HttpTokens", value.asInstanceOf[js.Any])
    
    inline def setHttpTokensUndefined: Self = StObject.set(x, "HttpTokens", js.undefined)
    
    inline def setInstanceMetadataTags(value: NonEmptyString): Self = StObject.set(x, "InstanceMetadataTags", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataTagsUndefined: Self = StObject.set(x, "InstanceMetadataTags", js.undefined)
  }
}
