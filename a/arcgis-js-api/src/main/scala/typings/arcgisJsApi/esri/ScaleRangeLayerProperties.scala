package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleRangeLayerProperties extends StObject {
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
  		 */
  var minScale: js.UndefOr[Double] = js.undefined
}
object ScaleRangeLayerProperties {
  
  inline def apply(): ScaleRangeLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleRangeLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleRangeLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
  }
}
