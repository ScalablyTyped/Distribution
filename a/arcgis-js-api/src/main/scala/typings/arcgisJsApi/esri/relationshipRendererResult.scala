package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait relationshipRendererResult
  extends StObject
     with Object {
  
  /**
    * The ID of the basemap used to determine the optimal fill colors of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var basemapTheme: String
  
  /**
    * Describes each class break for both fields considered in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var classBreaks: RendererResultClassBreaks
  
  /**
    * The relationship scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var relationshipScheme: RelationshipScheme
  
  /**
    * The renderer object representing the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  
  /**
    * Describes each container or bin used in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[typeUniqueValueInfo]
}
object relationshipRendererResult {
  
  inline def apply(
    basemapId: String,
    basemapTheme: String,
    classBreaks: RendererResultClassBreaks,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relationshipScheme: RelationshipScheme,
    renderer: UniqueValueRenderer,
    uniqueValueInfos: js.Array[typeUniqueValueInfo]
  ): relationshipRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], classBreaks = classBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipScheme = relationshipScheme.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], uniqueValueInfos = uniqueValueInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[relationshipRendererResult]
  }
  
  extension [Self <: relationshipRendererResult](x: Self) {
    
    inline def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    inline def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    inline def setClassBreaks(value: RendererResultClassBreaks): Self = StObject.set(x, "classBreaks", value.asInstanceOf[js.Any])
    
    inline def setRelationshipScheme(value: RelationshipScheme): Self = StObject.set(x, "relationshipScheme", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: UniqueValueRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueInfos(value: js.Array[typeUniqueValueInfo]): Self = StObject.set(x, "uniqueValueInfos", value.asInstanceOf[js.Any])
    
    inline def setUniqueValueInfosVarargs(value: typeUniqueValueInfo*): Self = StObject.set(x, "uniqueValueInfos", js.Array(value :_*))
  }
}
