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
    * The token for the next set of results, or null if there are no more results.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEulaAcceptancesRequest] (val x: Self) extends AnyVal {
    
    inline def setEulaIds(value: StringList): Self = StObject.set(x, "eulaIds", value.asInstanceOf[js.Any])
    
    inline def setEulaIdsUndefined: Self = StObject.set(x, "eulaIds", js.undefined)
    
    inline def setEulaIdsVarargs(value: String*): Self = StObject.set(x, "eulaIds", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
