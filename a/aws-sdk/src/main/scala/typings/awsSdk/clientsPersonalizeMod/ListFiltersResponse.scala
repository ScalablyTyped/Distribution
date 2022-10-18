package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFiltersResponse extends StObject {
  
  /**
    * A list of returned filters.
    */
  var Filters: js.UndefOr[typings.awsSdk.clientsPersonalizeMod.Filters] = js.undefined
  
  /**
    * A token for getting the next set of filters (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFiltersResponse {
  
  inline def apply(): ListFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFiltersResponse]
  }
  
  extension [Self <: ListFiltersResponse](x: Self) {
    
    inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: FilterSummary*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
