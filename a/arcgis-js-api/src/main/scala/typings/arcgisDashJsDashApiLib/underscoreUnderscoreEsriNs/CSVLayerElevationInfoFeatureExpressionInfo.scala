package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVLayerElevationInfoFeatureExpressionInfo
  extends stdLib.Object {
  /**
    * An [Arcade expression](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) evaluating to a number that determines the z-value of the feature. When `mode = "on-the-ground"`, this property has no effect. For line and polygon geometries the result of the expression is the same for all vertices of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo)
    */
  var expression: js.UndefOr[java.lang.String] = js.undefined
}

object CSVLayerElevationInfoFeatureExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    expression: java.lang.String = null
  ): CSVLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[CSVLayerElevationInfoFeatureExpressionInfo]
  }
}

