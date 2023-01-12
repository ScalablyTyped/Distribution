package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainConfigurationSummary extends StObject {
  
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined
  
  /**
    * The name of the domain configuration. This value must be unique to a region.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.undefined
  
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.undefined
}
object DomainConfigurationSummary {
  
  inline def apply(): DomainConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainConfigurationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainConfigurationSummary] (val x: Self) extends AnyVal {
    
    inline def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    inline def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
  }
}
