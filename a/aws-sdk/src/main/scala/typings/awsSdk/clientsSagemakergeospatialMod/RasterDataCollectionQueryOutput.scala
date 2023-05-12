package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterDataCollectionQueryOutput extends StObject {
  
  /**
    * The Area of Interest used in the search.
    */
  var AreaOfInterest: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.AreaOfInterest] = js.undefined
  
  /**
    * Property filters used in the search.
    */
  var PropertyFilters: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.PropertyFilters] = js.undefined
  
  /**
    * The ARN of the Raster Data Collection against which the search is done.
    */
  var RasterDataCollectionArn: DataCollectionArn
  
  /**
    * The name of the raster data collection.
    */
  var RasterDataCollectionName: String
  
  /**
    * The TimeRange filter used in the search.
    */
  var TimeRangeFilter: TimeRangeFilterOutput
}
object RasterDataCollectionQueryOutput {
  
  inline def apply(
    RasterDataCollectionArn: DataCollectionArn,
    RasterDataCollectionName: String,
    TimeRangeFilter: TimeRangeFilterOutput
  ): RasterDataCollectionQueryOutput = {
    val __obj = js.Dynamic.literal(RasterDataCollectionArn = RasterDataCollectionArn.asInstanceOf[js.Any], RasterDataCollectionName = RasterDataCollectionName.asInstanceOf[js.Any], TimeRangeFilter = TimeRangeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDataCollectionQueryOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterDataCollectionQueryOutput] (val x: Self) extends AnyVal {
    
    inline def setAreaOfInterest(value: AreaOfInterest): Self = StObject.set(x, "AreaOfInterest", value.asInstanceOf[js.Any])
    
    inline def setAreaOfInterestUndefined: Self = StObject.set(x, "AreaOfInterest", js.undefined)
    
    inline def setPropertyFilters(value: PropertyFilters): Self = StObject.set(x, "PropertyFilters", value.asInstanceOf[js.Any])
    
    inline def setPropertyFiltersUndefined: Self = StObject.set(x, "PropertyFilters", js.undefined)
    
    inline def setRasterDataCollectionArn(value: DataCollectionArn): Self = StObject.set(x, "RasterDataCollectionArn", value.asInstanceOf[js.Any])
    
    inline def setRasterDataCollectionName(value: String): Self = StObject.set(x, "RasterDataCollectionName", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeFilter(value: TimeRangeFilterOutput): Self = StObject.set(x, "TimeRangeFilter", value.asInstanceOf[js.Any])
  }
}
