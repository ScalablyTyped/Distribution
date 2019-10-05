package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudStretchRendererStops extends Object {
  /**
    * The color value for this stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var color: Color
  /**
    * The label for this stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The value for this stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html#stops)
    */
  var value: Double
}

object PointCloudStretchRendererStops {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double,
    label: String = null
  ): PointCloudStretchRendererStops = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[PointCloudStretchRendererStops]
  }
}

