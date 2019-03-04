package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudClassBreaksRendererColorClassBreakInfos
  extends stdLib.Object {
  /**
    * The color used to colorize the points where values are between the `minValue` and `maxValue` of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var color: Color
  /**
    * The label used to describe point in the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var maxValue: scala.Double
  /**
    * The minimum value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var minValue: scala.Double
}

object PointCloudClassBreaksRendererColorClassBreakInfos {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    maxValue: scala.Double,
    minValue: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    label: java.lang.String = null
  ): PointCloudClassBreaksRendererColorClassBreakInfos = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, maxValue = maxValue, minValue = minValue, propertyIsEnumerable = propertyIsEnumerable)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[PointCloudClassBreaksRendererColorClassBreakInfos]
  }
}

