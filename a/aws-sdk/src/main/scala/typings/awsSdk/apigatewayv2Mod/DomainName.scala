package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainName extends StObject {
  
  /**
    * The API mapping selection expression.
    */
  var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * The name of the DomainName resource.
    */
  var DomainName: StringWithLengthBetween1And512 = js.native
  
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.native
  
  /**
    * The mutual TLS authentication configuration for a custom domain name.
    */
  var MutualTlsAuthentication: js.UndefOr[typings.awsSdk.apigatewayv2Mod.MutualTlsAuthentication] = js.native
  
  /**
    * The collection of tags associated with a domain name.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
}
object DomainName {
  
  @scala.inline
  def apply(DomainName: StringWithLengthBetween1And512): DomainName = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainName]
  }
  
  @scala.inline
  implicit class DomainNameMutableBuilder[Self <: DomainName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiMappingSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "ApiMappingSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingSelectionExpressionUndefined: Self = StObject.set(x, "ApiMappingSelectionExpression", js.undefined)
    
    @scala.inline
    def setDomainName(value: StringWithLengthBetween1And512): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameConfigurations(value: DomainNameConfigurations): Self = StObject.set(x, "DomainNameConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameConfigurationsUndefined: Self = StObject.set(x, "DomainNameConfigurations", js.undefined)
    
    @scala.inline
    def setDomainNameConfigurationsVarargs(value: DomainNameConfiguration*): Self = StObject.set(x, "DomainNameConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setMutualTlsAuthentication(value: MutualTlsAuthentication): Self = StObject.set(x, "MutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "MutualTlsAuthentication", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
