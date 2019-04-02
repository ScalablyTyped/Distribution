package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerElevationInfoFeatureExpressionInfo
  extends stdLib.Object {
  /**
    * An [Arcade expression](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) evaluating to a number that determines the z-value of the feature. When `mode = "on-the-ground"`, this property has no effect. For line and polygon geometries the result of the expression is the same for all vertices of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo)
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
}

object GeoJSONLayerElevationInfoFeatureExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    expression: java.lang.String = null
  ): GeoJSONLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[GeoJSONLayerElevationInfoFeatureExpressionInfo]
  }
}

