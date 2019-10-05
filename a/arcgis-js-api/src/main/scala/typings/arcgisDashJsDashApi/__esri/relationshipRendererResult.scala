package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill colors of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var basemapId: String
  /**
    * Describes each class break for both fields considered in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var classBreaks: RendererResultClassBreaks
  /**
    * The relationship scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var relationshipScheme: RelationshipScheme
  /**
    * The renderer object representing the relationship visualization. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  /**
    * Describes each container or bin used in the visualization. Each unique value info object describes a class break for `field1` and `field2`. Therefore, features with the same color fall share will have values that fall in the same class break for `field1` and the same class break for `field2`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[typeUniqueValueInfo]
}

object relationshipRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    classBreaks: RendererResultClassBreaks,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    relationshipScheme: RelationshipScheme,
    renderer: UniqueValueRenderer,
    uniqueValueInfos: js.Array[typeUniqueValueInfo]
  ): relationshipRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, classBreaks = classBreaks, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), relationshipScheme = relationshipScheme, renderer = renderer, uniqueValueInfos = uniqueValueInfos)
  
    __obj.asInstanceOf[relationshipRendererResult]
  }
}

