package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2InstanceMetadataOptions extends StObject {
  
  /**
    * Enables or disables the HTTP metadata endpoint on the instance. 
    */
  var HttpEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Enables or disables the IPv6 endpoint for the instance metadata service. 
    */
  var HttpProtocolIpv6: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. 
    */
  var HttpPutResponseHopLimit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The state of token usage for your instance metadata requests. 
    */
  var HttpTokens: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies whether to allow access to instance tags from the instance metadata. 
    */
  var InstanceMetadataTags: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2InstanceMetadataOptions {
  
  inline def apply(): AwsEc2InstanceMetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2InstanceMetadataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2InstanceMetadataOptions] (val x: Self) extends AnyVal {
    
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
