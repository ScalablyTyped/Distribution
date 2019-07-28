package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the scale operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * scale-start | The type changes to `scale-start` at the start of scale or resize operation.
    * scale | The type changes to `scale` while graphics are being scaled or resized.
    * scale-stop | The type changes to `scale-stop` once graphics are scaled or resized.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var `type`: String
  /**
    * The x scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var xScale: Double
  /**
    * The y scale factor used to enlarge or shrink the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ScaleEventInfo)
    */
  var yScale: Double
}

object ScaleEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String,
    xScale: Double,
    yScale: Double
  ): ScaleEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), xScale = xScale, yScale = yScale)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ScaleEventInfo]
  }
}

