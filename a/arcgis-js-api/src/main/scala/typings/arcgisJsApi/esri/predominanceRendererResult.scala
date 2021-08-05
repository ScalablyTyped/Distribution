package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait predominanceRendererResult
  extends StObject
     with Object {
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var basemapTheme: String
  
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var excludedCategoryInfos: js.Array[js.Any]
  
  /**
    * An opacity visual variable representing the percentage of the total count comprised by the predominant value of all fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var opacity: js.UndefOr[opacityVisualVariableResult] = js.undefined
  
  /**
    * The predominance scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var predominanceScheme: PredominanceScheme
  
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var predominantCategoryInfos: js.Array[typeUniqueValueInfo]
  
  /**
    * The unique value renderer object representing the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  
  /**
    * A size visual variable representing the total count of all fields included in the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#RendererResult)
    */
  var size: js.UndefOr[sizeVisualVariableResult] = js.undefined
}
object predominanceRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    excludedCategoryInfos: js.Array[js.Any],
    hasOwnProperty: PropertyKey => Boolean,
    predominanceScheme: PredominanceScheme,
    predominantCategoryInfos: js.Array[typeUniqueValueInfo],
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: UniqueValueRenderer
  ): predominanceRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], excludedCategoryInfos = excludedCategoryInfos.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), predominanceScheme = predominanceScheme.asInstanceOf[js.Any], predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominanceRendererResult]
  }
  
  extension [Self <: predominanceRendererResult](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setExcludedCategoryInfos(value: js.Array[js.Any]): Self = StObject.set(x, "excludedCategoryInfos", value.asInstanceOf[js.Any])
    
    inline def setExcludedCategoryInfosVarargs(value: js.Any*): Self = StObject.set(x, "excludedCategoryInfos", js.Array(value :_*))
    
    inline def setOpacity(value: opacityVisualVariableResult): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPredominanceScheme(value: PredominanceScheme): Self = StObject.set(x, "predominanceScheme", value.asInstanceOf[js.Any])
    
    inline def setPredominantCategoryInfos(value: js.Array[typeUniqueValueInfo]): Self = StObject.set(x, "predominantCategoryInfos", value.asInstanceOf[js.Any])
    
    inline def setPredominantCategoryInfosVarargs(value: typeUniqueValueInfo*): Self = StObject.set(x, "predominantCategoryInfos", js.Array(value :_*))
    
    inline def setRenderer(value: UniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setSize(value: sizeVisualVariableResult): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
