package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTLSInspectionConfigurationsResponse extends StObject {
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Network Firewall returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The TLS inspection configuration metadata objects that you've defined. Depending on your setting for max results and the number of TLS inspection configurations, this might not be the full list.
    */
  var TLSInspectionConfigurations: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.TLSInspectionConfigurations] = js.undefined
}
object ListTLSInspectionConfigurationsResponse {
  
  inline def apply(): ListTLSInspectionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTLSInspectionConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTLSInspectionConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTLSInspectionConfigurations(value: TLSInspectionConfigurations): Self = StObject.set(x, "TLSInspectionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationsUndefined: Self = StObject.set(x, "TLSInspectionConfigurations", js.undefined)
    
    inline def setTLSInspectionConfigurationsVarargs(value: TLSInspectionConfigurationMetadata*): Self = StObject.set(x, "TLSInspectionConfigurations", js.Array(value*))
  }
}
