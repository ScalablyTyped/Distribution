package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerFeatureReduction
  extends stdLib.Object {
  /**
    * Type of the decluttering method. The only supported type at the moment is `"selection"`. In this method, some of the overlapping features are hidden such that none of the remaining features intersect on screen. Label deconfliction also respects this option and hides labels that would overlap with the features of this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction)
    */
  var `type`: java.lang.String
}

object FeatureLayerFeatureReduction {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String
  ): FeatureLayerFeatureReduction = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FeatureLayerFeatureReduction]
  }
}

