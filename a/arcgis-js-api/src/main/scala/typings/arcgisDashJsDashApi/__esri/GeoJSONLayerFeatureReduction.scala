package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerFeatureReduction extends Object {
  /**
    * Type of the decluttering method. The only supported type at the moment is `selection`. In this method, some of the overlapping features are hidden such that none of the remaining features intersect on screen. Label deconfliction also respects this option and hides labels that would overlap with the features of this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#featureReduction)
    */
  var `type`: String
}

object GeoJSONLayerFeatureReduction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): GeoJSONLayerFeatureReduction = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GeoJSONLayerFeatureReduction]
  }
}

