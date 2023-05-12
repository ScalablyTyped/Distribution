package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTLSInspectionConfigurationResponse extends StObject {
  
  /**
    * The high-level properties of a TLS inspection configuration. This, along with the TLSInspectionConfiguration, define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration. 
    */
  var TLSInspectionConfigurationResponse: typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfigurationResponse
}
object DeleteTLSInspectionConfigurationResponse {
  
  inline def apply(TLSInspectionConfigurationResponse: TLSInspectionConfigurationResponse): DeleteTLSInspectionConfigurationResponse = {
    val __obj = js.Dynamic.literal(TLSInspectionConfigurationResponse = TLSInspectionConfigurationResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTLSInspectionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTLSInspectionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setTLSInspectionConfigurationResponse(value: TLSInspectionConfigurationResponse): Self = StObject.set(x, "TLSInspectionConfigurationResponse", value.asInstanceOf[js.Any])
  }
}
