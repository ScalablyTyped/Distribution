package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRasterDataCollectionsOutput extends StObject {
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.NextToken] = js.undefined
  
  /**
    * Contains summary information about the raster data collection.
    */
  var RasterDataCollectionSummaries: DataCollectionsList
}
object ListRasterDataCollectionsOutput {
  
  inline def apply(RasterDataCollectionSummaries: DataCollectionsList): ListRasterDataCollectionsOutput = {
    val __obj = js.Dynamic.literal(RasterDataCollectionSummaries = RasterDataCollectionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRasterDataCollectionsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRasterDataCollectionsOutput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRasterDataCollectionSummaries(value: DataCollectionsList): Self = StObject.set(x, "RasterDataCollectionSummaries", value.asInstanceOf[js.Any])
    
    inline def setRasterDataCollectionSummariesVarargs(value: RasterDataCollectionMetadata*): Self = StObject.set(x, "RasterDataCollectionSummaries", js.Array(value*))
  }
}
