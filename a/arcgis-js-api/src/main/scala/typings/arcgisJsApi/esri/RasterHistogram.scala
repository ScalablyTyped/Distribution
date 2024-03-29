package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterHistogram extends StObject {
  
  /**
  		 * Count of pixels that fall into each bin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterHistogram)
  		 */
  var counts: js.Array[Double] | js.typedarray.Uint32Array
  
  /**
  		 * The maximum pixel value of the histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterHistogram)
  		 */
  var max: Double
  
  /**
  		 * The minimum pixel value of the histogram.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterHistogram)
  		 */
  var min: Double
  
  /**
  		 * Number of bins.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#RasterHistogram)
  		 */
  var size: Double
}
object RasterHistogram {
  
  inline def apply(counts: js.Array[Double] | js.typedarray.Uint32Array, max: Double, min: Double, size: Double): RasterHistogram = {
    val __obj = js.Dynamic.literal(counts = counts.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterHistogram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterHistogram] (val x: Self) extends AnyVal {
    
    inline def setCounts(value: js.Array[Double] | js.typedarray.Uint32Array): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsVarargs(value: Double*): Self = StObject.set(x, "counts", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
