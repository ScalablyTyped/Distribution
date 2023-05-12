package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRasterDataCollectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the raster data collection.
    */
  var Arn: DataCollectionArn
  
  /**
    * If the previous response was truncated, you receive this token. Use it in your next request to receive the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.NextToken] = js.undefined
  
  /**
    * RasterDataCollectionQuery consisting of AreaOfInterest(AOI), PropertyFilters and TimeRangeFilterInput used in SearchRasterDataCollection.
    */
  var RasterDataCollectionQuery: RasterDataCollectionQueryWithBandFilterInput
}
object SearchRasterDataCollectionInput {
  
  inline def apply(Arn: DataCollectionArn, RasterDataCollectionQuery: RasterDataCollectionQueryWithBandFilterInput): SearchRasterDataCollectionInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], RasterDataCollectionQuery = RasterDataCollectionQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRasterDataCollectionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRasterDataCollectionInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: DataCollectionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRasterDataCollectionQuery(value: RasterDataCollectionQueryWithBandFilterInput): Self = StObject.set(x, "RasterDataCollectionQuery", value.asInstanceOf[js.Any])
  }
}
