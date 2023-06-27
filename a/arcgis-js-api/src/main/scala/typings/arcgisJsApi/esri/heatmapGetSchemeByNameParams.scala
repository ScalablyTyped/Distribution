package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait heatmapGetSchemeByNameParams extends StObject {
  
  /**
  		 * The basemap to pair with the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getSchemeByName)
  		 */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
  		 * If you have a non-Esri basemap (e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getSchemeByName)
  		 */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
  		 * The name of the scheme to retrieve.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-heatmap.html#getSchemeByName)
  		 */
  var name: String
}
object heatmapGetSchemeByNameParams {
  
  inline def apply(name: String): heatmapGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapGetSchemeByNameParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: heatmapGetSchemeByNameParams] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
