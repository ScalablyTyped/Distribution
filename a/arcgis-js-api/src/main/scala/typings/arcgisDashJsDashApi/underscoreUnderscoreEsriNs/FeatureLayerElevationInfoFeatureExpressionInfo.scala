package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerElevationInfoFeatureExpressionInfo extends Object {
  /**
    * An [Arcade expression](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) evaluating to a number that determines the z-value of the feature. If the geometry has z-values, they will be ignored and `featureExpressionInfo` will be used to calculate the vertical position of the feature. When `mode = "on-the-ground"`, this property has no effect. For line and polygon geometries the result of the expression is the same for all vertices of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo)
    */
  var expression: js.UndefOr[String] = js.undefined
}

object FeatureLayerElevationInfoFeatureExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    expression: String = null
  ): FeatureLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[FeatureLayerElevationInfoFeatureExpressionInfo]
  }
}

