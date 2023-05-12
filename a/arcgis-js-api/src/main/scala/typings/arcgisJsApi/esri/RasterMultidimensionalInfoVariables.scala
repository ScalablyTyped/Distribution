package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterMultidimensionalInfoVariables extends StObject {
  
  /**
    * Variable description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A dimension may be used to represent real physical dimensions such as time or depth/height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var dimensions: js.Array[RasterMultidimensionalInfoVariablesDimensions]
  
  /**
    * Variable histograms.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var histograms: js.UndefOr[js.Array[RasterHistogram]] = js.undefined
  
  /**
    * Variable name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var name: String
  
  /**
    * Variable statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#RasterMultidimensionalInfo)
    */
  var statistics: js.UndefOr[js.Array[RasterBandStatistics]] = js.undefined
  
  /**
    * Unit of the variable measured in.
    *
    * [Read more...](global.html#unit)
    */
  var unit: js.UndefOr[String] = js.undefined
}
object RasterMultidimensionalInfoVariables {
  
  inline def apply(dimensions: js.Array[RasterMultidimensionalInfoVariablesDimensions], name: String): RasterMultidimensionalInfoVariables = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterMultidimensionalInfoVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterMultidimensionalInfoVariables] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDimensions(value: js.Array[RasterMultidimensionalInfoVariablesDimensions]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsVarargs(value: RasterMultidimensionalInfoVariablesDimensions*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setHistograms(value: js.Array[RasterHistogram]): Self = StObject.set(x, "histograms", value.asInstanceOf[js.Any])
    
    inline def setHistogramsUndefined: Self = StObject.set(x, "histograms", js.undefined)
    
    inline def setHistogramsVarargs(value: RasterHistogram*): Self = StObject.set(x, "histograms", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatistics(value: js.Array[RasterBandStatistics]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatisticsVarargs(value: RasterBandStatistics*): Self = StObject.set(x, "statistics", js.Array(value*))
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
