package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainConfigurationRequest extends StObject {
  
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.undefined
  
  /**
    * The name of the domain configuration to be updated.
    */
  var domainConfigurationName: ReservedDomainConfigurationName
  
  /**
    * The status to which the domain configuration should be updated.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.undefined
  
  /**
    * Removes the authorization configuration from a domain.
    */
  var removeAuthorizerConfig: js.UndefOr[RemoveAuthorizerConfig] = js.undefined
}
object UpdateDomainConfigurationRequest {
  
  inline def apply(domainConfigurationName: ReservedDomainConfigurationName): UpdateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigurationRequest]
  }
  
  extension [Self <: UpdateDomainConfigurationRequest](x: Self) {
    
    inline def setAuthorizerConfig(value: AuthorizerConfig): Self = StObject.set(x, "authorizerConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerConfigUndefined: Self = StObject.set(x, "authorizerConfig", js.undefined)
    
    inline def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationStatus(value: DomainConfigurationStatus): Self = StObject.set(x, "domainConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationStatusUndefined: Self = StObject.set(x, "domainConfigurationStatus", js.undefined)
    
    inline def setRemoveAuthorizerConfig(value: RemoveAuthorizerConfig): Self = StObject.set(x, "removeAuthorizerConfig", value.asInstanceOf[js.Any])
    
    inline def setRemoveAuthorizerConfigUndefined: Self = StObject.set(x, "removeAuthorizerConfig", js.undefined)
  }
}
