package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dark
import typings.arcgisJsApi.arcgisJsApiStrings.default
import typings.arcgisJsApi.arcgisJsApiStrings.light
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipGetSchemesByTagParams
  extends StObject
     with Object {
  
  /**
    * The basemap to pair with the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  
  /**
    * If you have a non-Esri basemap (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var basemapTheme: js.UndefOr[light | dark] = js.undefined
  
  /**
    * When provided, only schemes missing all the provided tags will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The geometry type of the features to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var geometryType: point | multipoint | polyline | polygon | mesh | multipatch
  
  /**
    * When provided, only schemes containing all the matching tags will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Determines which set of primary and secondary color schemes to return.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var theme: js.UndefOr[default] = js.undefined
  
  /**
    * The SceneView instance in which the scheme will be used.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  
  /**
    * Indicates if the size units of the scheme will be in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#getSchemesByTag)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}
object relationshipGetSchemesByTagParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | mesh | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): relationshipGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[relationshipGetSchemesByTagParams]
  }
  
  @scala.inline
  implicit class relationshipGetSchemesByTagParamsMutableBuilder[Self <: relationshipGetSchemesByTagParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemap(value: String | Basemap): Self = StObject.set(x, "basemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: light | dark): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapThemeUndefined: Self = StObject.set(x, "basemapTheme", js.undefined)
    
    @scala.inline
    def setBasemapUndefined: Self = StObject.set(x, "basemap", js.undefined)
    
    @scala.inline
    def setExcludedTags(value: js.Array[String]): Self = StObject.set(x, "excludedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedTagsUndefined: Self = StObject.set(x, "excludedTags", js.undefined)
    
    @scala.inline
    def setExcludedTagsVarargs(value: String*): Self = StObject.set(x, "excludedTags", js.Array(value :_*))
    
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | mesh | multipatch): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedTags(value: js.Array[String]): Self = StObject.set(x, "includedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedTagsUndefined: Self = StObject.set(x, "includedTags", js.undefined)
    
    @scala.inline
    def setIncludedTagsVarargs(value: String*): Self = StObject.set(x, "includedTags", js.Array(value :_*))
    
    @scala.inline
    def setTheme(value: default): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setView(value: SceneView): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWorldScale(value: Boolean): Self = StObject.set(x, "worldScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldScaleUndefined: Self = StObject.set(x, "worldScale", js.undefined)
  }
}
