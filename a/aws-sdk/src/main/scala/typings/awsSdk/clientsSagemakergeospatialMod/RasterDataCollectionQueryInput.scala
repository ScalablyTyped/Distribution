package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterDataCollectionQueryInput extends StObject {
  
  /**
    * The area of interest being queried for the raster data collection.
    */
  var AreaOfInterest: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.AreaOfInterest] = js.undefined
  
  /**
    * The list of Property filters used in the Raster Data Collection Query.
    */
  var PropertyFilters: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.PropertyFilters] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the raster data collection.
    */
  var RasterDataCollectionArn: DataCollectionArn
  
  /**
    * The TimeRange Filter used in the RasterDataCollection Query.
    */
  var TimeRangeFilter: TimeRangeFilterInput
}
object RasterDataCollectionQueryInput {
  
  inline def apply(RasterDataCollectionArn: DataCollectionArn, TimeRangeFilter: TimeRangeFilterInput): RasterDataCollectionQueryInput = {
    val __obj = js.Dynamic.literal(RasterDataCollectionArn = RasterDataCollectionArn.asInstanceOf[js.Any], TimeRangeFilter = TimeRangeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDataCollectionQueryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterDataCollectionQueryInput] (val x: Self) extends AnyVal {
    
    inline def setAreaOfInterest(value: AreaOfInterest): Self = StObject.set(x, "AreaOfInterest", value.asInstanceOf[js.Any])
    
    inline def setAreaOfInterestUndefined: Self = StObject.set(x, "AreaOfInterest", js.undefined)
    
    inline def setPropertyFilters(value: PropertyFilters): Self = StObject.set(x, "PropertyFilters", value.asInstanceOf[js.Any])
    
    inline def setPropertyFiltersUndefined: Self = StObject.set(x, "PropertyFilters", js.undefined)
    
    inline def setRasterDataCollectionArn(value: DataCollectionArn): Self = StObject.set(x, "RasterDataCollectionArn", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeFilter(value: TimeRangeFilterInput): Self = StObject.set(x, "TimeRangeFilter", value.asInstanceOf[js.Any])
  }
}
