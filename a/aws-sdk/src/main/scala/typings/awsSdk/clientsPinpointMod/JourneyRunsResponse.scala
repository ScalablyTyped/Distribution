package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyRunsResponse extends StObject {
  
  /**
    * An array of responses, one for each run of the journey
    */
  var Item: ListOfJourneyRunResponse
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object JourneyRunsResponse {
  
  inline def apply(Item: ListOfJourneyRunResponse): JourneyRunsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ListOfJourneyRunResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: JourneyRunResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
