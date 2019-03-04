package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveEventInfo
  extends stdLib.Object
     with UpdateToolEventInfo {
  /**
    * Number of pixels moved on the x-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dx: scala.Double
  /**
    * Number of pixels moved on the y-axis from the last known position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var dy: scala.Double
  /**
    * The instance of the graphic that is being moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var mover: Graphic
  /**
    * Returns information indicating the stage of the move operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * move-start | The type changes to `move-start` at the start of `move` operation.
    * move | The type changes to `move` while graphics are being moved.
    * move-stop | The type changes to `move-stop` once graphics are moved.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#MoveEventInfo)
    */
  var `type`: java.lang.String
}

object MoveEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    dx: scala.Double,
    dy: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    mover: Graphic,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String
  ): MoveEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, dx = dx, dy = dy, hasOwnProperty = hasOwnProperty, mover = mover, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MoveEventInfo]
  }
}

