package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterDataCollectionQueryWithBandFilterInput extends StObject {
  
  /**
    * The Area of interest to be used in the search query.
    */
  var AreaOfInterest: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.AreaOfInterest] = js.undefined
  
  /**
    * The list of Bands to be displayed in the result for each item.
    */
  var BandFilter: js.UndefOr[StringListInput] = js.undefined
  
  /**
    * The Property Filters used in the search query.
    */
  var PropertyFilters: js.UndefOr[typings.awsSdk.clientsSagemakergeospatialMod.PropertyFilters] = js.undefined
  
  /**
    * The TimeRange Filter used in the search query.
    */
  var TimeRangeFilter: TimeRangeFilterInput
}
object RasterDataCollectionQueryWithBandFilterInput {
  
  inline def apply(TimeRangeFilter: TimeRangeFilterInput): RasterDataCollectionQueryWithBandFilterInput = {
    val __obj = js.Dynamic.literal(TimeRangeFilter = TimeRangeFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterDataCollectionQueryWithBandFilterInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterDataCollectionQueryWithBandFilterInput] (val x: Self) extends AnyVal {
    
    inline def setAreaOfInterest(value: AreaOfInterest): Self = StObject.set(x, "AreaOfInterest", value.asInstanceOf[js.Any])
    
    inline def setAreaOfInterestUndefined: Self = StObject.set(x, "AreaOfInterest", js.undefined)
    
    inline def setBandFilter(value: StringListInput): Self = StObject.set(x, "BandFilter", value.asInstanceOf[js.Any])
    
    inline def setBandFilterUndefined: Self = StObject.set(x, "BandFilter", js.undefined)
    
    inline def setBandFilterVarargs(value: String*): Self = StObject.set(x, "BandFilter", js.Array(value*))
    
    inline def setPropertyFilters(value: PropertyFilters): Self = StObject.set(x, "PropertyFilters", value.asInstanceOf[js.Any])
    
    inline def setPropertyFiltersUndefined: Self = StObject.set(x, "PropertyFilters", js.undefined)
    
    inline def setTimeRangeFilter(value: TimeRangeFilterInput): Self = StObject.set(x, "TimeRangeFilter", value.asInstanceOf[js.Any])
  }
}
