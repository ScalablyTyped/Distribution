package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainConfigurationRequest extends StObject {
  
  /**
    * The name of the domain configuration to be deleted.
    */
  var domainConfigurationName: DomainConfigurationName
}
object DeleteDomainConfigurationRequest {
  
  inline def apply(domainConfigurationName: DomainConfigurationName): DeleteDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainConfigurationName(value: DomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
  }
}
