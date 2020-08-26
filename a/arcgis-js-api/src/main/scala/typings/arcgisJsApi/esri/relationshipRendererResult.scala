package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait relationshipRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill colors of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var basemapTheme: String = js.native
  /**
    * Describes each class break for both fields considered in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var classBreaks: RendererResultClassBreaks = js.native
  /**
    * The relationship scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var relationshipScheme: RelationshipScheme = js.native
  /**
    * The renderer object representing the relationship visualization. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var renderer: UniqueValueRenderer = js.native
  /**
    * Describes each container or bin used in the visualization. Each unique value info object describes a class break for `field1` and `field2`. Therefore, features with the same color fall share will have values that fall in the same class break for `field1` and the same class break for `field2`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-relationship.html#RendererResult)
    */
  var uniqueValueInfos: js.Array[typeUniqueValueInfo] = js.native
}

object relationshipRendererResult {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class relationshipRendererResultOps[Self <: relationshipRendererResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBasemapId(value: String): Self = this.set("basemapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemapTheme(value: String): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassBreaks(value: RendererResultClassBreaks): Self = this.set("classBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelationshipScheme(value: RelationshipScheme): Self = this.set("relationshipScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: UniqueValueRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueValueInfosVarargs(value: typeUniqueValueInfo*): Self = this.set("uniqueValueInfos", js.Array(value :_*))
    @scala.inline
    def setUniqueValueInfos(value: js.Array[typeUniqueValueInfo]): Self = this.set("uniqueValueInfos", value.asInstanceOf[js.Any])
  }
  
}

