package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSimulationsInput extends StObject {
  
  /**
    * The maximum number of simulations to list.
    */
  var MaxResults: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * If SimSpace Weaver returns nextToken, then there are more results available. The value of nextToken is a unique pagination token for each page. To retrieve the next page, call the operation again using the returned token. Keep all other arguments unchanged. If no results remain, then nextToken is set to null. Each pagination token expires after 24 hours. If you provide a token that isn't valid, then you receive an HTTP 400 ValidationException error.
    */
  var NextToken: js.UndefOr[OptionalString] = js.undefined
}
object ListSimulationsInput {
  
  inline def apply(): ListSimulationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSimulationsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSimulationsInput] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PositiveInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: OptionalString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
