package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainNameRequest extends StObject {
  
  /**
    * The domain name.
    */
  var DomainName: StringWithLengthBetween1And512
  
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.undefined
  
  /**
    * The mutual TLS authentication configuration for a custom domain name.
    */
  var MutualTlsAuthentication: js.UndefOr[MutualTlsAuthenticationInput] = js.undefined
  
  /**
    * The collection of tags associated with a domain name.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
}
object CreateDomainNameRequest {
  
  inline def apply(DomainName: StringWithLengthBetween1And512): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
  
  extension [Self <: CreateDomainNameRequest](x: Self) {
    
    inline def setDomainName(value: StringWithLengthBetween1And512): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigurations(value: DomainNameConfigurations): Self = StObject.set(x, "DomainNameConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigurationsUndefined: Self = StObject.set(x, "DomainNameConfigurations", js.undefined)
    
    inline def setDomainNameConfigurationsVarargs(value: DomainNameConfiguration*): Self = StObject.set(x, "DomainNameConfigurations", js.Array(value :_*))
    
    inline def setMutualTlsAuthentication(value: MutualTlsAuthenticationInput): Self = StObject.set(x, "MutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    inline def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "MutualTlsAuthentication", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
