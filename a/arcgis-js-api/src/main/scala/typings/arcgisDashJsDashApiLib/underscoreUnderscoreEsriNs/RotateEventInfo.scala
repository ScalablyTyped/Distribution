package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateEventInfo
  extends stdLib.Object
     with UpdateToolEventInfo {
  /**
    * Angle of rotation in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#RotateEventInfo)
    */
  var angle: scala.Double
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
  var `type`: java.lang.String
}

object RotateEventInfo {
  @scala.inline
  def apply(
    angle: scala.Double,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    `type`: java.lang.String
  ): RotateEventInfo = {
    val __obj = js.Dynamic.literal(angle = angle, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RotateEventInfo]
  }
}

