package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationsResponse extends StObject {
  
  /**
    * Returns configuration details, including the configuration ID, attribute names, and attribute values.
    */
  var configurations: js.UndefOr[Configurations] = js.undefined
  
  /**
    * Token to retrieve the next set of results. For example, if your call to ListConfigurations returned 100 items, but you set ListConfigurationsRequest$maxResults to 10, you received a set of 10 results along with this token. Use this token in the next query to retrieve the next set of 10.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListConfigurationsResponse {
  
  inline def apply(): ListConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationsResponse]
  }
  
  extension [Self <: ListConfigurationsResponse](x: Self) {
    
    inline def setConfigurations(value: Configurations): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: Configuration*): Self = StObject.set(x, "configurations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
