package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterMultidimensionalInfoVariablesDimensions extends StObject {
  
  /**
    * Dimension description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The extent of dimension values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var extent: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Indicates if the dimension is recorded at regular intervals.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var hasRegularIntervals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Dimension interval.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Dimension interval unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var intervalUnit: js.UndefOr[String] = js.undefined
  
  /**
    * Dimension name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var name: String
  
  /**
    * Dimension unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var unit: js.UndefOr[String] = js.undefined
  
  /**
    * An array of single values or tuples [min, max] each defining a range of valid values along the specified dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var values: js.UndefOr[js.Array[js.Array[Double] | Double]] = js.undefined
}
object RasterMultidimensionalInfoVariablesDimensions {
  
  inline def apply(name: String): RasterMultidimensionalInfoVariablesDimensions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterMultidimensionalInfoVariablesDimensions]
  }
  
  extension [Self <: RasterMultidimensionalInfoVariablesDimensions](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtent(value: js.Array[Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setExtentVarargs(value: Double*): Self = StObject.set(x, "extent", js.Array(value*))
    
    inline def setHasRegularIntervals(value: Boolean): Self = StObject.set(x, "hasRegularIntervals", value.asInstanceOf[js.Any])
    
    inline def setHasRegularIntervalsUndefined: Self = StObject.set(x, "hasRegularIntervals", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setIntervalUnit(value: String): Self = StObject.set(x, "intervalUnit", value.asInstanceOf[js.Any])
    
    inline def setIntervalUnitUndefined: Self = StObject.set(x, "intervalUnit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValues(value: js.Array[js.Array[Double] | Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
