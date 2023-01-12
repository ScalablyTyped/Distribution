package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterIdentifyResult extends StObject {
  
  /**
    * Transposed multidimensional data for the requested location and variable returned from a transposed multidimensional [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#identify).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyResult)
    */
  var dataSeries: js.UndefOr[js.Array[RasterSliceValue]] = js.undefined
  
  /**
    * The identified location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyResult)
    */
  var location: Point
  
  /**
    * Image service pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#RasterIdentifyResult)
    */
  var value: js.Array[Double]
}
object RasterIdentifyResult {
  
  inline def apply(location: Point, value: js.Array[Double]): RasterIdentifyResult = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterIdentifyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterIdentifyResult] (val x: Self) extends AnyVal {
    
    inline def setDataSeries(value: js.Array[RasterSliceValue]): Self = StObject.set(x, "dataSeries", value.asInstanceOf[js.Any])
    
    inline def setDataSeriesUndefined: Self = StObject.set(x, "dataSeries", js.undefined)
    
    inline def setDataSeriesVarargs(value: RasterSliceValue*): Self = StObject.set(x, "dataSeries", js.Array(value*))
    
    inline def setLocation(value: Point): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
