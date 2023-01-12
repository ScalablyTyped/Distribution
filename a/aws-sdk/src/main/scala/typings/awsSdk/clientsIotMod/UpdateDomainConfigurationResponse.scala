package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainConfigurationResponse extends StObject {
  
  /**
    * The ARN of the domain configuration that was updated.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.undefined
  
  /**
    * The name of the domain configuration that was updated.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.undefined
}
object UpdateDomainConfigurationResponse {
  
  inline def apply(): UpdateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDomainConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    inline def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
  }
}
