package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityConfigurationResponse extends StObject {
  
  /**
    * The requested security configuration.
    */
  var SecurityConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.SecurityConfiguration] = js.undefined
}
object GetSecurityConfigurationResponse {
  
  inline def apply(): GetSecurityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityConfigurationResponse]
  }
  
  extension [Self <: GetSecurityConfigurationResponse](x: Self) {
    
    inline def setSecurityConfiguration(value: SecurityConfiguration): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
  }
}
