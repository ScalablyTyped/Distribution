package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`flow-line`
import typings.arcgisJsApi.arcgisJsApiStrings.`wave-front`
import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait flowGetSchemesParams extends StObject {
  
  /**
  		 * The Esri basemap to pair with the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getSchemes)
  		 */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
  		 * If you have a non-Esri basemap (e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getSchemes)
  		 */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
  		 * Determines how flow lines will render.
  		 *
  		 * @default "flow-line"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-flow.html#getSchemes)
  		 */
  var theme: js.UndefOr[`flow-line` | `wave-front`] = js.undefined
}
object flowGetSchemesParams {
  
  inline def apply(): flowGetSchemesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[flowGetSchemesParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: flowGetSchemesParams] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setTheme(value: `flow-line` | `wave-front`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
