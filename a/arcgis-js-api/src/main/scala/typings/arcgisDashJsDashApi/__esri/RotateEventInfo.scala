package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Angle of rotation in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var angle: Double
  /**
    * Returns information indicating the stage of the rotate operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * rotate-start | The type changes to `rotate-start` at the start of `rotate` operation.
    * rotate | The type changes to `rotate` while graphics are being rotated.
    * rotate-stop | The type changes to `rotate-stop` once graphics are rotated.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var `type`: String
}

object RotateEventInfo {
  @scala.inline
  def apply(
    angle: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotateEventInfo]
  }
}

