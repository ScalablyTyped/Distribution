package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTLSInspectionConfigurationResponse extends StObject {
  
  /**
    * The high-level properties of a TLS inspection configuration. This, along with the TLSInspectionConfiguration, define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling DescribeTLSInspectionConfiguration. 
    */
  var TLSInspectionConfigurationResponse: typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfigurationResponse
  
  /**
    * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of the request.  To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has changed, the operation fails with an InvalidTokenException. If this happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed, then try the operation again using the new token. 
    */
  var UpdateToken: typings.awsSdk.clientsNetworkfirewallMod.UpdateToken
}
object UpdateTLSInspectionConfigurationResponse {
  
  inline def apply(TLSInspectionConfigurationResponse: TLSInspectionConfigurationResponse, UpdateToken: UpdateToken): UpdateTLSInspectionConfigurationResponse = {
    val __obj = js.Dynamic.literal(TLSInspectionConfigurationResponse = TLSInspectionConfigurationResponse.asInstanceOf[js.Any], UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTLSInspectionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTLSInspectionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setTLSInspectionConfigurationResponse(value: TLSInspectionConfigurationResponse): Self = StObject.set(x, "TLSInspectionConfigurationResponse", value.asInstanceOf[js.Any])
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
