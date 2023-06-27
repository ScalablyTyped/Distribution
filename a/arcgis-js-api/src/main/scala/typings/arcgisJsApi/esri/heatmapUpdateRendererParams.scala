package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait heatmapUpdateRendererParams extends StObject {
  
  /**
  		 * Indicates how much to fade the lower color stops with transparency to create a fuzzy boundary on the edge of the heatmap.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#updateRenderer)
  		 */
  var fadeRatio: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The heatmap renderer for which to add or remove opacity.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#updateRenderer)
  		 */
  var renderer: HeatmapRenderer
}
object heatmapUpdateRendererParams {
  
  inline def apply(renderer: HeatmapRenderer): heatmapUpdateRendererParams = {
    val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapUpdateRendererParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: heatmapUpdateRendererParams] (val x: Self) extends AnyVal {
    
    inline def setFadeRatio(value: Double): Self = StObject.set(x, "fadeRatio", value.asInstanceOf[js.Any])
    
    inline def setFadeRatioUndefined: Self = StObject.set(x, "fadeRatio", js.undefined)
    
    inline def setRenderer(value: HeatmapRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
