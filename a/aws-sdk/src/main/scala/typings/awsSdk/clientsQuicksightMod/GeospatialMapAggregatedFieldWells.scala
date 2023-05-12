package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialMapAggregatedFieldWells extends StObject {
  
  /**
    * The color field wells of a geospatial map.
    */
  var Colors: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The geospatial field wells of a geospatial map. Values are grouped by geospatial fields.
    */
  var Geospatial: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The size field wells of a geospatial map. Values are aggregated based on geospatial fields.
    */
  var Values: js.UndefOr[MeasureFieldList] = js.undefined
}
object GeospatialMapAggregatedFieldWells {
  
  inline def apply(): GeospatialMapAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeospatialMapAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialMapAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setColors(value: DimensionFieldList): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    inline def setColorsVarargs(value: DimensionField*): Self = StObject.set(x, "Colors", js.Array(value*))
    
    inline def setGeospatial(value: DimensionFieldList): Self = StObject.set(x, "Geospatial", value.asInstanceOf[js.Any])
    
    inline def setGeospatialUndefined: Self = StObject.set(x, "Geospatial", js.undefined)
    
    inline def setGeospatialVarargs(value: DimensionField*): Self = StObject.set(x, "Geospatial", js.Array(value*))
    
    inline def setValues(value: MeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
