package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dotDensityGetSchemesByTagParams extends StObject {
  
  /**
  		 * The basemap to pair with the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
  		 */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
  		 * If you have a non-Esri basemap (e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
  		 */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
  		 * When provided, only schemes missing all the provided tags will be returned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
  		 */
  var excludedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * When provided, only schemes containing all the matching tags will be returned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
  		 */
  var includedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The number of colors to visualize.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-dotDensity.html#getSchemesByTag)
  		 */
  var numColors: Double
}
object dotDensityGetSchemesByTagParams {
  
  inline def apply(numColors: Double): dotDensityGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(numColors = numColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[dotDensityGetSchemesByTagParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dotDensityGetSchemesByTagParams] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setExcludedTags(value: js.Array[String]): Self = StObject.set(x, "excludedTags", value.asInstanceOf[js.Any])
    
    inline def setExcludedTagsUndefined: Self = StObject.set(x, "excludedTags", js.undefined)
    
    inline def setExcludedTagsVarargs(value: String*): Self = StObject.set(x, "excludedTags", js.Array(value*))
    
    inline def setIncludedTags(value: js.Array[String]): Self = StObject.set(x, "includedTags", value.asInstanceOf[js.Any])
    
    inline def setIncludedTagsUndefined: Self = StObject.set(x, "includedTags", js.undefined)
    
    inline def setIncludedTagsVarargs(value: String*): Self = StObject.set(x, "includedTags", js.Array(value*))
    
    inline def setNumColors(value: Double): Self = StObject.set(x, "numColors", value.asInstanceOf[js.Any])
  }
}
