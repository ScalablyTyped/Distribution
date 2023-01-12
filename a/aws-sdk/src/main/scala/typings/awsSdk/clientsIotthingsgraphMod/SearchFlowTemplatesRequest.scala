package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFlowTemplatesRequest extends StObject {
  
  /**
    * An array of objects that limit the result set. The only valid filter is DEVICE_MODEL_ID.
    */
  var filters: js.UndefOr[FlowTemplateFilters] = js.undefined
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchFlowTemplatesRequest {
  
  inline def apply(): SearchFlowTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchFlowTemplatesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFlowTemplatesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FlowTemplateFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: FlowTemplateFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
