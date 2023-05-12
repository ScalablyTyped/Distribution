package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStudioComponentsRequest extends StObject {
  
  /**
    * The max number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Filters the request to studio components that are in one of the given states. 
    */
  var states: js.UndefOr[StudioComponentStateList] = js.undefined
  
  /**
    * The studio ID. 
    */
  var studioId: String
  
  /**
    * Filters the request to studio components that are of one of the given types.
    */
  var types: js.UndefOr[StudioComponentTypeList] = js.undefined
}
object ListStudioComponentsRequest {
  
  inline def apply(studioId: String): ListStudioComponentsRequest = {
    val __obj = js.Dynamic.literal(studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStudioComponentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStudioComponentsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStates(value: StudioComponentStateList): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: StudioComponentState*): Self = StObject.set(x, "states", js.Array(value*))
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: StudioComponentTypeList): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: StudioComponentType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
