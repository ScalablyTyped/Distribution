package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait relationshipRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal fill colors of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#RendererResult)
    */
  var basemapId: java.lang.String
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
  var uniqueValueInfos: js.Array[UniqueValueInfo]
}

object relationshipRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    classBreaks: RendererResultClassBreaks,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    relationshipScheme: RelationshipScheme,
    renderer: UniqueValueRenderer,
    uniqueValueInfos: js.Array[UniqueValueInfo]
  ): relationshipRendererResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basemapId")(basemapId)
    __obj.updateDynamic("classBreaks")(classBreaks)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("relationshipScheme")(relationshipScheme)
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("uniqueValueInfos")(uniqueValueInfos)
    __obj.asInstanceOf[relationshipRendererResult]
  }
}

