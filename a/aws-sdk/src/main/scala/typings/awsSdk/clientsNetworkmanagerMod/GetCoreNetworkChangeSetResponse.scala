package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkChangeSetResponse extends StObject {
  
  /**
    * Describes a core network changes.
    */
  var CoreNetworkChanges: js.UndefOr[CoreNetworkChangeList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetCoreNetworkChangeSetResponse {
  
  inline def apply(): GetCoreNetworkChangeSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoreNetworkChangeSetResponse]
  }
  
  extension [Self <: GetCoreNetworkChangeSetResponse](x: Self) {
    
    inline def setCoreNetworkChanges(value: CoreNetworkChangeList): Self = StObject.set(x, "CoreNetworkChanges", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkChangesUndefined: Self = StObject.set(x, "CoreNetworkChanges", js.undefined)
    
    inline def setCoreNetworkChangesVarargs(value: CoreNetworkChange*): Self = StObject.set(x, "CoreNetworkChanges", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
