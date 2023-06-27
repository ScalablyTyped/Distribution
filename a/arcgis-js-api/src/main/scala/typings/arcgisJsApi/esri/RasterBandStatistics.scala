package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterBandStatistics extends StObject {
  
  /**
  		 * Average of the statistics.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterBandStatistics)
  		 */
  var avg: Double
  
  /**
  		 * Maximum value of the statistics.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterBandStatistics)
  		 */
  var max: Double
  
  /**
  		 * Minimum value of the statistics.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterBandStatistics)
  		 */
  var min: Double
  
  /**
  		 * Standard deviation of the statistics.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterBandStatistics)
  		 */
  var stddev: Double
}
object RasterBandStatistics {
  
  inline def apply(avg: Double, max: Double, min: Double, stddev: Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal(avg = avg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterBandStatistics] (val x: Self) extends AnyVal {
    
    inline def setAvg(value: Double): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
  }
}
