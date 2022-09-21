package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainNameResponse extends StObject {
  
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
  
  /**
    * The name of the DomainName resource.
    */
  var DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
  
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.undefined
  
  /**
    * The mutual TLS authentication configuration for a custom domain name.
    */
  var MutualTlsAuthentication: js.UndefOr[typings.awsSdk.apigatewayv2Mod.MutualTlsAuthentication] = js.undefined
  
  /**
    * The collection of tags associated with a domain name.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
}
object CreateDomainNameResponse {
  
  inline def apply(): CreateDomainNameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainNameResponse]
  }
  
  extension [Self <: CreateDomainNameResponse](x: Self) {
    
    inline def setApiMappingSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ApiMappingSelectionExpression", value.asInstanceOf[js.Any])
    
    inline def setApiMappingSelectionExpressionUndefined: Self = StObject.set(x, "ApiMappingSelectionExpression", js.undefined)
    
    inline def setDomainName(value: StringWithLengthBetween1And512): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigurations(value: DomainNameConfigurations): Self = StObject.set(x, "DomainNameConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDomainNameConfigurationsUndefined: Self = StObject.set(x, "DomainNameConfigurations", js.undefined)
    
    inline def setDomainNameConfigurationsVarargs(value: DomainNameConfiguration*): Self = StObject.set(x, "DomainNameConfigurations", js.Array(value*))
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setMutualTlsAuthentication(value: MutualTlsAuthentication): Self = StObject.set(x, "MutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    inline def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "MutualTlsAuthentication", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
