package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCostCategoriesResponse extends StObject {
  
  /**
    * The names of the Cost Categories.
    */
  var CostCategoryNames: js.UndefOr[CostCategoryNamesList] = js.undefined
  
  /**
    * The Cost Category values. If the CostCategoryName key isn't specified in the request, the CostCategoryValues fields aren't returned. 
    */
  var CostCategoryValues: js.UndefOr[CostCategoryValuesList] = js.undefined
  
  /**
    * If the number of objects that are still available for retrieval exceeds the quota, Amazon Web Services returns a NextPageToken value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The number of objects that are returned.
    */
  var ReturnSize: PageSize
  
  /**
    * The total number of objects.
    */
  var TotalSize: PageSize
}
object GetCostCategoriesResponse {
  
  inline def apply(ReturnSize: PageSize, TotalSize: PageSize): GetCostCategoriesResponse = {
    val __obj = js.Dynamic.literal(ReturnSize = ReturnSize.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCostCategoriesResponse]
  }
  
  extension [Self <: GetCostCategoriesResponse](x: Self) {
    
    inline def setCostCategoryNames(value: CostCategoryNamesList): Self = StObject.set(x, "CostCategoryNames", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryNamesUndefined: Self = StObject.set(x, "CostCategoryNames", js.undefined)
    
    inline def setCostCategoryNamesVarargs(value: CostCategoryName*): Self = StObject.set(x, "CostCategoryNames", js.Array(value*))
    
    inline def setCostCategoryValues(value: CostCategoryValuesList): Self = StObject.set(x, "CostCategoryValues", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryValuesUndefined: Self = StObject.set(x, "CostCategoryValues", js.undefined)
    
    inline def setCostCategoryValuesVarargs(value: CostCategoryValue*): Self = StObject.set(x, "CostCategoryValues", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setReturnSize(value: PageSize): Self = StObject.set(x, "ReturnSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSize(value: PageSize): Self = StObject.set(x, "TotalSize", value.asInstanceOf[js.Any])
  }
}
