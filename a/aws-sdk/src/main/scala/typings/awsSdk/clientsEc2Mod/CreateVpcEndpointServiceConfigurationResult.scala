package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcEndpointServiceConfigurationResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the service configuration.
    */
  var ServiceConfiguration: js.UndefOr[typings.awsSdk.clientsEc2Mod.ServiceConfiguration] = js.undefined
}
object CreateVpcEndpointServiceConfigurationResult {
  
  inline def apply(): CreateVpcEndpointServiceConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
  }
  
  extension [Self <: CreateVpcEndpointServiceConfigurationResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setServiceConfiguration(value: ServiceConfiguration): Self = StObject.set(x, "ServiceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigurationUndefined: Self = StObject.set(x, "ServiceConfiguration", js.undefined)
  }
}
