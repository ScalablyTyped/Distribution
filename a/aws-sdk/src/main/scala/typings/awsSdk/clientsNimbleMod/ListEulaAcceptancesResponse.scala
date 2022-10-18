package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEulaAcceptancesResponse extends StObject {
  
  /**
    * A collection of EULA acceptances.
    */
  var eulaAcceptances: js.UndefOr[EulaAcceptanceList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListEulaAcceptancesResponse {
  
  inline def apply(): ListEulaAcceptancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEulaAcceptancesResponse]
  }
  
  extension [Self <: ListEulaAcceptancesResponse](x: Self) {
    
    inline def setEulaAcceptances(value: EulaAcceptanceList): Self = StObject.set(x, "eulaAcceptances", value.asInstanceOf[js.Any])
    
    inline def setEulaAcceptancesUndefined: Self = StObject.set(x, "eulaAcceptances", js.undefined)
    
    inline def setEulaAcceptancesVarargs(value: EulaAcceptance*): Self = StObject.set(x, "eulaAcceptances", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
