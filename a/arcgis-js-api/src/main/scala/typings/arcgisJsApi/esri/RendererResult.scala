package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererResult extends StObject {
  
  /**
  		 * The ID of the basemap used to determine the optimal colors of the dots.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#RendererResult)
  		 */
  var basemapId: String
  
  /**
  		 * Indicates whether the average color of the input view's basemap is `light` or `dark`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#RendererResult)
  		 */
  var basemapTheme: String
  
  /**
  		 * The dot density scheme used by the renderer based on the view's background.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#RendererResult)
  		 */
  var dotDensityScheme: DotDensityScheme
  
  /**
  		 * The object representing the dot density visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#RendererResult)
  		 */
  var renderer: DotDensityRenderer
}
object RendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    dotDensityScheme: DotDensityScheme,
    renderer: DotDensityRenderer
  ): RendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], dotDensityScheme = dotDensityScheme.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererResult] (val x: Self) extends AnyVal {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setDotDensityScheme(value: DotDensityScheme): Self = StObject.set(x, "dotDensityScheme", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: DotDensityRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
