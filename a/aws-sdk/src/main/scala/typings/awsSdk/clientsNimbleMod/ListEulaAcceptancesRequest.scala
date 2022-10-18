package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEulaAcceptancesRequest extends StObject {
  
  /**
    * The list of EULA IDs that have been previously accepted.
    */
  var eulaIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The token to request the next page of results. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object ListEulaAcceptancesRequest {
  
  inline def apply(studioId: String): ListEulaAcceptancesRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEulaAcceptancesRequest]
  }
  
  extension [Self <: ListEulaAcceptancesRequest](x: Self) {
    
    inline def setEulaIds(value: StringList): Self = StObject.set(x, "eulaIds", value.asInstanceOf[js.Any])
    
    inline def setEulaIdsUndefined: Self = StObject.set(x, "eulaIds", js.undefined)
    
    inline def setEulaIdsVarargs(value: String*): Self = StObject.set(x, "eulaIds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
