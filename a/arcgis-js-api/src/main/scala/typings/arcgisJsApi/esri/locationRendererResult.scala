package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait locationRendererResult extends StObject {
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#RendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#RendererResult)
    */
  var basemapTheme: String
  
  /**
    * The location scheme used by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#RendererResult)
    */
  var locationScheme: LocationScheme
  
  /**
    * A simple renderer configured with a single color best suited to match the background of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#RendererResult)
    */
  var renderer: SimpleRenderer
}
object locationRendererResult {
  
  inline def apply(basemapId: String, basemapTheme: String, locationScheme: LocationScheme, renderer: SimpleRenderer): locationRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], locationScheme = locationScheme.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[locationRendererResult]
  }
  
  extension [Self <: locationRendererResult](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setLocationScheme(value: LocationScheme): Self = StObject.set(x, "locationScheme", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: SimpleRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
