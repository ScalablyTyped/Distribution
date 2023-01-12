package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainConfigurationRequest extends StObject {
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: ReservedDomainConfigurationName
}
object DescribeDomainConfigurationRequest {
  
  inline def apply(domainConfigurationName: ReservedDomainConfigurationName): DescribeDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
  }
}
