package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainConfigurationResponse extends StObject {
  
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.undefined
  
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.undefined
  
  /**
    * A Boolean value that specifies the current state of the domain configuration.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.undefined
  
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The type of the domain.
    */
  var domainType: js.UndefOr[DomainType] = js.undefined
  
  /**
    * The date and time the domain configuration's status was last changed.
    */
  var lastStatusChangeDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list containing summary information about the server certificate included in the domain configuration.
    */
  var serverCertificates: js.UndefOr[ServerCertificates] = js.undefined
  
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.undefined
}
object DescribeDomainConfigurationResponse {
  
  inline def apply(): DescribeDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerConfig(value: AuthorizerConfig): Self = StObject.set(x, "authorizerConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerConfigUndefined: Self = StObject.set(x, "authorizerConfig", js.undefined)
    
    inline def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    inline def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
    
    inline def setDomainConfigurationStatus(value: DomainConfigurationStatus): Self = StObject.set(x, "domainConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationStatusUndefined: Self = StObject.set(x, "domainConfigurationStatus", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainType(value: DomainType): Self = StObject.set(x, "domainType", value.asInstanceOf[js.Any])
    
    inline def setDomainTypeUndefined: Self = StObject.set(x, "domainType", js.undefined)
    
    inline def setLastStatusChangeDate(value: js.Date): Self = StObject.set(x, "lastStatusChangeDate", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeDateUndefined: Self = StObject.set(x, "lastStatusChangeDate", js.undefined)
    
    inline def setServerCertificates(value: ServerCertificates): Self = StObject.set(x, "serverCertificates", value.asInstanceOf[js.Any])
    
    inline def setServerCertificatesUndefined: Self = StObject.set(x, "serverCertificates", js.undefined)
    
    inline def setServerCertificatesVarargs(value: ServerCertificateSummary*): Self = StObject.set(x, "serverCertificates", js.Array(value*))
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
  }
}
