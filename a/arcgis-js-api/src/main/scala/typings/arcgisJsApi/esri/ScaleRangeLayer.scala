package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleRangeLayer extends StObject {
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
  		 */
  var maxScale: Double
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
  		 */
  var minScale: Double
}
object ScaleRangeLayer {
  
  inline def apply(maxScale: Double, minScale: Double): ScaleRangeLayer = {
    val __obj = js.Dynamic.literal(maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleRangeLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleRangeLayer] (val x: Self) extends AnyVal {
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
  }
}
