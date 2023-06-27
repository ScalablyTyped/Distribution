package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait colorCreatePCTrueColorRendererParams extends StObject {
  
  /**
  		 * The number of points per inch in the view.
  		 *
  		 * @default 25
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
  		 */
  var density: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The layer for which the visualization is generated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
  		 */
  var layer: PointCloudLayer
  
  /**
  		 * Allows for cancelable requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
  		 * The size of each point expressed as a percentage.
  		 *
  		 * @default 100%
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
  		 */
  var size: js.UndefOr[String] = js.undefined
}
object colorCreatePCTrueColorRendererParams {
  
  inline def apply(layer: PointCloudLayer): colorCreatePCTrueColorRendererParams = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorCreatePCTrueColorRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: colorCreatePCTrueColorRendererParams] (val x: Self) extends AnyVal {
    
    inline def setDensity(value: Double): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDensityUndefined: Self = StObject.set(x, "density", js.undefined)
    
    inline def setLayer(value: PointCloudLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
