package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkAnalyzerConfigurationsResponse extends StObject {
  
  /**
    * The list of network analyzer configurations.
    */
  var NetworkAnalyzerConfigurationList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NetworkAnalyzerConfigurationList] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
}
object ListNetworkAnalyzerConfigurationsResponse {
  
  inline def apply(): ListNetworkAnalyzerConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworkAnalyzerConfigurationsResponse]
  }
  
  extension [Self <: ListNetworkAnalyzerConfigurationsResponse](x: Self) {
    
    inline def setNetworkAnalyzerConfigurationList(value: NetworkAnalyzerConfigurationList): Self = StObject.set(x, "NetworkAnalyzerConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setNetworkAnalyzerConfigurationListUndefined: Self = StObject.set(x, "NetworkAnalyzerConfigurationList", js.undefined)
    
    inline def setNetworkAnalyzerConfigurationListVarargs(value: NetworkAnalyzerConfigurations*): Self = StObject.set(x, "NetworkAnalyzerConfigurationList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
