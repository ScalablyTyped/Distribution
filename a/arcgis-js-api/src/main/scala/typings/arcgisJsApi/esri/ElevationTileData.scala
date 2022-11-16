package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationTileData extends StObject {
  
  /**
    * The height of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var height: Double
  
  /**
    * The maximum allowed error of the Z-value for each value in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var maxZError: Double
  
  /**
    * Indicating the pixel values where no elevation data is present.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var noDataValue: Double
  
  /**
    * The elevation values of each pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var values: js.Array[Double]
  
  /**
    * The width of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var width: Double
}
object ElevationTileData {
  
  inline def apply(height: Double, maxZError: Double, noDataValue: Double, values: js.Array[Double], width: Double): ElevationTileData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], maxZError = maxZError.asInstanceOf[js.Any], noDataValue = noDataValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationTileData]
  }
  
  extension [Self <: ElevationTileData](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxZError(value: Double): Self = StObject.set(x, "maxZError", value.asInstanceOf[js.Any])
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
