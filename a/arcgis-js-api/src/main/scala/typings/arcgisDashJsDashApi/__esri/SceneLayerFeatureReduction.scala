package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneLayerFeatureReduction extends Object {
  /**
    * Type of the decluttering method. The only supported type at the moment is `"selection"`. In this method, some of the overlapping features are hidden such that none of the remaining features intersect on screen. Label deconfliction also respects this option and hides labels that would overlap with the features of this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#featureReduction)
    */
  var `type`: String
}

object SceneLayerFeatureReduction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): SceneLayerFeatureReduction = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SceneLayerFeatureReduction]
  }
}

