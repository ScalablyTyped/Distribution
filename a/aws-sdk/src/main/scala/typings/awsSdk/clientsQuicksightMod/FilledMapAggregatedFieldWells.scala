package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilledMapAggregatedFieldWells extends StObject {
  
  /**
    * The aggregated location field well of the filled map. Values are grouped by location fields.
    */
  var Geospatial: js.UndefOr[FilledMapDimensionFieldList] = js.undefined
  
  /**
    * The aggregated color field well of a filled map. Values are aggregated based on location fields.
    */
  var Values: js.UndefOr[FilledMapMeasureFieldList] = js.undefined
}
object FilledMapAggregatedFieldWells {
  
  inline def apply(): FilledMapAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilledMapAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilledMapAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setGeospatial(value: FilledMapDimensionFieldList): Self = StObject.set(x, "Geospatial", value.asInstanceOf[js.Any])
    
    inline def setGeospatialUndefined: Self = StObject.set(x, "Geospatial", js.undefined)
    
    inline def setGeospatialVarargs(value: DimensionField*): Self = StObject.set(x, "Geospatial", js.Array(value*))
    
    inline def setValues(value: FilledMapMeasureFieldList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: MeasureField*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
