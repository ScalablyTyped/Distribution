package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`point-cloud-class`
import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.default_
import typings.arcgisJsApi.arcgisJsApiStrings.light
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait typeGetSchemesByTagParams extends StObject {
  
  /**
  		 * The basemap to pair with the visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
  		 */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
  		 * If you have a non-Esri basemap (e.g.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
  		 */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
  		 * When provided, only schemes missing all the provided tags will be returned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
  		 */
  var excludedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The geometry type of the features to visualize.
  		 *
  		 * [Read more...](global.html#geometryType)
  		 */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch
  
  /**
  		 * When provided, only schemes containing all the matching tags will be returned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
  		 */
  var includedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Determines whether to return a standardized	unique value scheme for point cloud class renderers (i.e.
  		 *
  		 * @default default
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
  		 */
  var theme: js.UndefOr[`point-cloud-class` | default_] = js.undefined
  
  /**
  		 * The SceneView instance in which the scheme will be used.
  		 *
  		 * [Read more...](global.html)
  		 */
  var view: js.UndefOr[SceneView] = js.undefined
  
  /**
  		 * Indicates if the size units of the scheme will be in meters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-type.html#getSchemesByTag)
  		 */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}
object typeGetSchemesByTagParams {
  
  inline def apply(geometryType: point | multipoint | polyline | polygon | mesh | multipatch): typeGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(geometryType = geometryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeGetSchemesByTagParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typeGetSchemesByTagParams] (val x: Self) extends AnyVal {
    
    inline def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    inline def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    inline def setExcludedTags(value: js.Array[String]): Self = StObject.set(x, "excludedTags", value.asInstanceOf[js.Any])
    
    inline def setExcludedTagsUndefined: Self = StObject.set(x, "excludedTags", js.undefined)
    
    inline def setExcludedTagsVarargs(value: String*): Self = StObject.set(x, "excludedTags", js.Array(value*))
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setIncludedTags(value: js.Array[String]): Self = StObject.set(x, "includedTags", value.asInstanceOf[js.Any])
    
    inline def setIncludedTagsUndefined: Self = StObject.set(x, "includedTags", js.undefined)
    
    inline def setIncludedTagsVarargs(value: String*): Self = StObject.set(x, "includedTags", js.Array(value*))
    
    inline def setTheme(value: `point-cloud-class` | default_): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setView(value: SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWorldScale(value: Boolean): Self = StObject.set(x, "worldScale", value.asInstanceOf[js.Any])
    
    inline def setWorldScaleUndefined: Self = StObject.set(x, "worldScale", js.undefined)
  }
}
