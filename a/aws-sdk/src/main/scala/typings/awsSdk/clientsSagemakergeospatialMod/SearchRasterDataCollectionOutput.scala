package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRasterDataCollectionOutput extends StObject {
  
  /**
    * Approximate number of results in the response.
    */
  var ApproximateResultCount: Integer
  
  /**
    * List of items matching the Raster DataCollectionQuery.
    */
  var Items: js.UndefOr[ItemSourceList] = js.undefined
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.NextToken] = js.undefined
}
object SearchRasterDataCollectionOutput {
  
  inline def apply(ApproximateResultCount: Integer): SearchRasterDataCollectionOutput = {
    val __obj = js.Dynamic.literal(ApproximateResultCount = ApproximateResultCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRasterDataCollectionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRasterDataCollectionOutput] (val x: Self) extends AnyVal {
    
    inline def setApproximateResultCount(value: Integer): Self = StObject.set(x, "ApproximateResultCount", value.asInstanceOf[js.Any])
    
    inline def setItems(value: ItemSourceList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ItemSource*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
