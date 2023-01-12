package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait typeRendererResult extends StObject {
  
  /**
    * The ID of the basemap used to determine the optimal color scheme to represent the categorical variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#RendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#RendererResult)
    */
  var basemapTheme: String
  
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#RendererResult)
    */
  var excludedUniqueValueInfos: js.Array[Any]
  
  /**
    * The renderer object configured to best match the background of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  
  /**
    * The scheme used to represent each category within the `uniqueValueInfos`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#RendererResult)
    */
  var typeScheme: TypeScheme
  
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[typeUniqueValueInfo]
}
object typeRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    excludedUniqueValueInfos: js.Array[Any],
    renderer: UniqueValueRenderer,
    typeScheme: TypeScheme,
    uniqueValueInfos: js.Array[typeUniqueValueInfo]
  ): typeRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], excludedUniqueValueInfos = excludedUniqueValueInfos.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], typeScheme = typeScheme.asInstanceOf[js.Any], uniqueValueInfos = uniqueValueInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeRendererResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: typeRendererResult] (val x: Self) extends AnyVal {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setExcludedUniqueValueInfos(value: js.Array[Any]): Self = StObject.set(x, "excludedUniqueValueInfos", value.asInstanceOf[js.Any])
    
    inline def setExcludedUniqueValueInfosVarargs(value: Any*): Self = StObject.set(x, "excludedUniqueValueInfos", js.Array(value*))
    
    inline def setRenderer(value: UniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setTypeScheme(value: TypeScheme): Self = StObject.set(x, "typeScheme", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueInfos(value: js.Array[typeUniqueValueInfo]): Self = StObject.set(x, "uniqueValueInfos", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueInfosVarargs(value: typeUniqueValueInfo*): Self = StObject.set(x, "uniqueValueInfos", js.Array(value*))
  }
}
