package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudClassBreaksRendererColorClassBreakInfos extends Object {
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
  var label: js.UndefOr[String] = js.undefined
  /**
    * The maximum value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var maxValue: Double
  /**
    * The minimum value of the break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var minValue: Double
}

object PointCloudClassBreaksRendererColorClassBreakInfos {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    label: String = null
  ): PointCloudClassBreaksRendererColorClassBreakInfos = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue, minValue = minValue, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[PointCloudClassBreaksRendererColorClassBreakInfos]
  }
}

